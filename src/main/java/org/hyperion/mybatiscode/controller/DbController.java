package org.hyperion.mybatiscode.controller;

import com.google.common.base.CaseFormat;
import org.hyperion.mybatiscode.model.Db;
import org.hyperion.mybatiscode.model.RespBean;
import org.hyperion.mybatiscode.model.TableClass;
import org.hyperion.mybatiscode.utils.DBUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DbController {
    @PostMapping("/connect")
    public RespBean connect(@RequestBody Db db) {
        DBUtils.initDb(db);
        Connection con = DBUtils.getConnection();
        if (con != null) {
            return RespBean.ok("数据库连接成功");
        } else {
            return RespBean.error("数据库连接失败");
        }
    }

    @PostMapping("/config")
    public RespBean config(@RequestBody Map<String, String> map) {
        String packageName = map.get("packageName");
        try {
            Connection connection = DBUtils.getConnection();
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(connection.getCatalog(), null, null, null);
            List<TableClass> tableClassList = new ArrayList<>();
            while (tables.next()) {
                TableClass tableClass = new TableClass();
                tableClass.setPackageName(packageName);
                String table_name = tables.getString("TABLE_NAME");
                String modelName = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, table_name);
                tableClass.setTableName(table_name);
                tableClass.setModelName(modelName);
                tableClass.setControllerName(modelName + "Controller");
                tableClass.setServiceName(modelName + "Service");
                tableClass.setMapperName(modelName + "Mapper");
                tableClassList.add(tableClass);
            }
            return RespBean.ok("数据库信息读取成功", tableClassList);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return RespBean.error("数据库信息读取失败");
    }
}

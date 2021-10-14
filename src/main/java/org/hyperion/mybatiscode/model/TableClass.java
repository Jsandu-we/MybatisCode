package org.hyperion.mybatiscode.model;

import java.util.List;

public class TableClass {
    private String tableName;
    private String modelName;
    private String mapperName;
    private String serviceName;
    private String controllerName;
    private String packageName;
    private List<ColumnClass> columns;

    @Override
    public String toString() {
        return "TableClass{" +
                "tableName='" + tableName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", mapperName='" + mapperName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", controllerName='" + controllerName + '\'' +
                ", packageName='" + packageName + '\'' +
                ", columns=" + columns +
                '}';
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMapperName() {
        return mapperName;
    }

    public void setMapperName(String mapperName) {
        this.mapperName = mapperName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<ColumnClass> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnClass> columns) {
        this.columns = columns;
    }
}

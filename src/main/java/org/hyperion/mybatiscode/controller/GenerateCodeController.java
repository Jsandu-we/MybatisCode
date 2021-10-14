package org.hyperion.mybatiscode.controller;

import org.hyperion.mybatiscode.model.RespBean;
import org.hyperion.mybatiscode.model.TableClass;
import org.hyperion.mybatiscode.service.GenerateCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class GenerateCodeController {
    @Autowired
    GenerateCodeService generateCodeService;

    @ResponseBody
    @PostMapping("/generateCode")
    public RespBean generateCode(@RequestBody List<TableClass> tableClassList, HttpServletRequest req){
        return generateCodeService.generateCode(tableClassList,req.getServletContext().getRealPath("/"));
    }
}

package ${packageName}.controller;

import ${packageName}.model.${modelName};
import ${packageName}.service.${serviceName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ${controllerName}{

    @Autowired
    ${serviceName} ${serviceName?uncap_first};

    @ResponseBody
    @GetMapping("/${modelName?lower_case}s")
    public List<${modelName}> getAll${modelName}s(){
        return ${serviceName?uncap_first}.getAll${modelName}s();
    }
}
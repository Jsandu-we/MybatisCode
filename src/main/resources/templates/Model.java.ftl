package ${packageName}.model;

import java.util.Date;

public class ${modelName}{
<#if columns??>
    <#list columns as column>
        <#if column.type = 'INTEGER' || column.type = 'INT' || column.type = 'INT UNSIGNED'>
            <#if column.remark?? && column.remark != ''>
    /**
     * ${column.remark}
     */
            </#if>
    private Integer ${column.propertyName?uncap_first};

        </#if>
        <#if column.type = 'BIGINT'>
            <#if column.remark?? && column.remark != ''>
    /**
     * ${column.remark}
     */
            </#if>
     private Long ${column.propertyName?uncap_first};

        </#if>
        <#if column.type = 'DOUBLE'>
            <#if column.remark?? && column.remark != ''>
    /**
     * ${column.remark}
     */
            </#if>
     private Double ${column.propertyName?uncap_first};

        </#if>
        <#if column.type = 'FLOAT'>
            <#if column.remark?? && column.remark != ''>
    /**
     * ${column.remark}
     */
            </#if>
     private Float ${column.propertyName?uncap_first};

        </#if>
        <#if column.type = 'VARCHAR' || column.type = 'TEXT' || column.type = 'CHAR' || column.type = 'ENUM' || column.type = 'SET'>
            <#if column.remark?? && column.remark != ''>
    /**
     * ${column.remark}
     */
            </#if>
    private String ${column.propertyName?uncap_first};

        </#if>
        <#if column.type = 'DATETIME'>
            <#if column.remark?? && column.remark != ''>
    /**
     * ${column.remark}
     */
            </#if>
    private Date ${column.propertyName?uncap_first};

        </#if>
        <#if column.type = 'BIT'>
            <#if column.remark?? && column.remark != ''>
    /**
     * ${column.remark}
     */
            </#if>
    private Boolean ${column.propertyName?uncap_first};

        </#if>
    </#list>
</#if>

<#if columns??>
    <#list columns as column>
        <#if column.type = 'INT' || column.type = 'INTEGER' || column.type = 'INT UNSIGNED'>

    public Integer get${column.propertyName}(){
    return ${column.propertyName?uncap_first};
    }

    public void set${column.propertyName}(Integer ${column.propertyName?uncap_first}){
    this.${column.propertyName?uncap_first} = ${column.propertyName?uncap_first};
    }
        </#if>
        <#if column.type = 'BIGINT'>

    public Long get${column.propertyName}(){
    return ${column.propertyName?uncap_first};
    }

    public void set${column.propertyName}(Long ${column.propertyName?uncap_first}){
    this.${column.propertyName?uncap_first} = ${column.propertyName?uncap_first};
    }
        </#if>
        <#if column.type = 'FLOAT'>

    public Float get${column.propertyName}(){
    return ${column.propertyName?uncap_first};
    }

    public void set${column.propertyName}(Float ${column.propertyName?uncap_first}){
    this.${column.propertyName?uncap_first} = ${column.propertyName?uncap_first};
    }
        </#if>
        <#if column.type = 'DOUBLE'>

    public Double get${column.propertyName}(){
    return ${column.propertyName?uncap_first};
    }

    public void set${column.propertyName}(Double ${column.propertyName?uncap_first}){
    this.${column.propertyName?uncap_first} = ${column.propertyName?uncap_first};
    }
        </#if>
        <#if column.type = 'VARCHAR' || column.type = 'TEXT' || column.type = 'CHAR' || column.type = 'ENUM' || column.type = 'SET'>

    public String get${column.propertyName}(){
        return ${column.propertyName?uncap_first};
    }

    public void set${column.propertyName}(String ${column.propertyName?uncap_first}){
        this.${column.propertyName?uncap_first} = ${column.propertyName?uncap_first};
    }
        </#if>
        <#if column.type = 'DATETIME'>

    public Date get${column.propertyName}(){
        return ${column.propertyName?uncap_first};
    }

    public void set${column.propertyName}(Date ${column.propertyName?uncap_first}){
        this.${column.propertyName?uncap_first} = ${column.propertyName?uncap_first};
    }
        </#if>
        <#if column.type = 'BIT'>

    public Boolean get${column.propertyName}(){
        return ${column.propertyName?uncap_first};
    }

    public void set${column.propertyName}(Boolean ${column.propertyName?uncap_first}){
        this.${column.propertyName?uncap_first} = ${column.propertyName?uncap_first};
    }
        </#if>
    </#list>
</#if>
}
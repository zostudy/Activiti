package com.asiainfo.activiti.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 流程生成模型
 * 
 * @author 01Studio
 *
 */
@Data
@ApiModel(description = "流程生成模型")
public class ProcessGenerateDTO {
	
	@ApiModelProperty(value = "流程业务表名称")
	private List<String> tableNames;

	@ApiModelProperty(value = "流程图文件名称")
	private String fileName;
}

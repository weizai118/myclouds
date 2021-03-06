package com.gitee.myclouds.system.domain.myorg;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * <b>组织机构表[my_org]数据实体对象</b>
 * <p>
 * 注意:此文件由MyClouds平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author myclouds team
 * @date 2019-06-10 22:02:03
 */
@Data
@ToString
// @Accessors(chain = true) 此注解和BeanUtils的属性复制冲突，暂时不适用链式编程注解
public class MyOrgEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	//流水号
	private Integer id;	

	//组织名称
	private String name;	

	//父节点流水号
	private Integer parent_id;	

	//组织类型
	private String type;	

	//扩展码
	private String biz_code;	

	//排序号
	private Integer sort_no;	

	//扩展JSON
	private String ext;	

	//创建时间
    @JSONField (format="yyyy-MM-dd HH:mm:ss")
	private Date create_time;	

	//创建人ID
	private Integer create_by_id;	

	//创建人
	private String create_by;	

	//备注
	private String remark;	

}
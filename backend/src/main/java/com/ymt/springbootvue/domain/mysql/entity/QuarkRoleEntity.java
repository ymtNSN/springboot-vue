package com.ymt.springbootvue.domain.mysql.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

import lombok.Data;

import javax.persistence.*;

/**
 * @author yaojunguang
 * create time: Mon Jul 29 14:24:48 CST 2019.
 */

@Data
@Entity
@Table(name = "quark_role")
@ApiModel(description = "<a href='/web/swift/QuarkRoleEntity' target=_blank>QuarkRoleEntity</a>")
public class QuarkRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "name")
    private String name;

}

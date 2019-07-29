package com.ymt.springbootvue.domain.mysql.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

import lombok.Data;

import javax.persistence.*;

/**
 * @author yaojunguang
 * create time: Mon Jul 29 14:25:28 CST 2019.
 */

@Data
@Entity
@Table(name = "quark_label")
@ApiModel(description = "<a href='/web/swift/QuarkLabelEntity' target=_blank>QuarkLabelEntity</a>")
public class QuarkLabelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "details")
    private String details;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "posts_count")
    private Integer postsCount;

}

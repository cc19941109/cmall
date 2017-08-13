package com.chen.cmall.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TODO：
 * String,Integer 的大小设定
 */
//@Table(name = "cmall_user",
//        uniqueConstraints = {@UniqueConstraint(columnNames = {"username"}),
//                @UniqueConstraint(columnNames = {"email","phone"})})
@Entity
@Table(name = "cmall_user")
public class User {

    /**
     * strategy:
     * TABLE：使用一个特定的数据库表格来保存主键。
     * SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
     * IDENTITY：主键由数据库自动生成（主要是自动增长型）
     * AUTO：主键由程序控制。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String email;

    private String phone;

    private String question;

    private String answer;
    @NotNull
    private Integer role;
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date updateTime;

    //@Transient：表示该属性并非一个到数据库表的字段的映射,ORM框架将忽略该属性.
    //@Transient
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;

    // @Column(precision = 8,scale = 2,nullable = false)不生效，precision,scale仅对bigDecimal有效
    @Column(columnDefinition = "double(10,2) NOT NULL  DEFAULT 0")
    private Double money;

    public User(Integer id, String username, String password, String email, String phone, String question, String answer, Integer role, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.question = question;
        this.answer = answer;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User() {
        super();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
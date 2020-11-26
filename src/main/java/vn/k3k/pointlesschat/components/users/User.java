package vn.k3k.pointlesschat.components.users;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.elasticsearch.annotations.DateFormat;

@Document(indexName = "user")
@Getter
@Setter
public class User {
    @Id
    private String id;

    private String loginName;

    private String password;

    private String userName;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "uuuu-MM-dd'T'HH:mm:ss.SSSZZ")
    private Date createTime;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "uuuu-MM-dd'T'HH:mm:ss.SSSZZ")
    private Date lastModifiedDate;

}

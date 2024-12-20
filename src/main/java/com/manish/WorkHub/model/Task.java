package com.manish.WorkHub.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document
public class Task {
    @Id
    private String taskId;
    private String userId;
    private String tag;
    private String charge;
    private String emailId;
    private String phoneNo;
    private Date createdDate;
    private List<String> images;
    private Boolean status;
}
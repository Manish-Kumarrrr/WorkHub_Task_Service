package com.manish.WorkHub.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class TaskRequest {
    private String taskId;
    private String userId;
    private String tag;
    private String charge;
    private String emailId;
    private String phoneNo;
    private Date createdDate;
    private List<String> images;
    private String status;
    private String description;
    private String lattitude;
    private String longitude;
}

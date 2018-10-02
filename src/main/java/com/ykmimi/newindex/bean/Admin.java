package com.ykmimi.newindex.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    private Long admin_id;
    private String admin_name;
    private String admin_password;
    private Date reg_date;

    public Long getAdmin_id() {
        return admin_id;
    }

}

package com.tangdi.production.tdbase.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2019/8/28
 * @since 1.0
 */
@Data
public class BaseBean implements Serializable {

    private String createUserId;
    private String createDate;

    private String editUserId;
    private String editDate;
}

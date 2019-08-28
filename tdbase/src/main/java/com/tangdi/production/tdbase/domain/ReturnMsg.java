package com.tangdi.production.tdbase.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2019/8/28
 * @since 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnMsg {

    private Object obj;

    public ReturnMsg(Integer totalRows, List list) {
    }

    public void setMsg(String s, String s1) {

    }

}

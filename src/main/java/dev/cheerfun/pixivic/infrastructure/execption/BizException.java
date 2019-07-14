package dev.cheerfun.pixivic.infrastructure.execption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author echo huang
 * @version 1.0
 * @date 2019-07-13 14:48
 * @description 自定义业务异常
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class BizException extends BaseException {
    public BizException(String code, String msg) {
        super(code, msg);
    }
}
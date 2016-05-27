package org.pcsoft.framework.jeb.qualifier.surround;

import org.pcsoft.framework.jeb.annotation.SurroundQualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by pfeifchr on 27.05.2016.
 */
@Documented
@Retention(RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@SurroundQualifier
public @interface SurroundMethod2 {
}

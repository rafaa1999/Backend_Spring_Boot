package com.bafoly.ex.user;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = UniqueEmailValidator.class)
public @interface UniqeEmail {

	  String message() default "This email is in use";

		Class<?>[] groups() default { };

		Class<? extends Payload>[] payload() default { };
}

package br.com.zup.annotation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000f\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/annotation/UniqueElement;", "", "domain", "", "fieldName", "message", "()Ljava/lang/String;", "keymgr"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@javax.validation.Constraint(validatedBy = {br.com.zup.annotation.UniqueElementValidation.class})
@javax.validation.ReportAsSingleViolation()
public abstract @interface UniqueElement {
    
    public abstract java.lang.String domain();
    
    public abstract java.lang.String fieldName();
    
    public abstract java.lang.String message() default "Message Default";
}
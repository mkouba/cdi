/*
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.enterprise.inject.spi.configurator;

import java.lang.annotation.Annotation;

import javax.enterprise.inject.spi.AnnotatedField;

/**
 * This interface is part of the {@link AnnotatedTypeConfigurator} SPI and helps defining an {@link AnnotatedField}
 * 
 * @author Martin Kouba
 * @author Antoine Sabot-Durand
 * @since 2.0
 * @param <T> the class declaring the field
 */
public interface AnnotatedFieldConfigurator<T> {
    
    /**
     * 
     * @return the original {@link AnnotatedField}
     */
    AnnotatedField<T> getAnnotated();
    
    /**
     * Add an annotation to the field.
     * 
     * @param annotation the annotation to add
     * @return self
     */
    AnnotatedFieldConfigurator<T> add(Annotation annotation);
    
    /**
     * Remove the specified annotation.
     *
     * @param annotation the annotation to remove
     * @return self
     */
    AnnotatedFieldConfigurator<T> remove(Annotation annotation);
    
    /**
     * Removes all annotations with the specified type from the field. Annotation members are ignored.
     * 
     * @param annotationType the annotation type
     * @return self
     */
    AnnotatedFieldConfigurator<T> remove(Class<? extends Annotation> annotationType);
    
    /**
     * Remove all annotations from the field.
     * 
     * @return self
     */
    AnnotatedFieldConfigurator<T> removeAll();

}

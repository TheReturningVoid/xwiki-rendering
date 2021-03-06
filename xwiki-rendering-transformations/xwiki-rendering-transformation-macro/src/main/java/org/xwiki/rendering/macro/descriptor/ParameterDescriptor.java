/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.macro.descriptor;

import java.lang.reflect.Type;

/**
 * Define a macro parameter.
 *
 * @version $Id$
 * @since 1.7M2
 */
public interface ParameterDescriptor
{
    /**
     * @return the identifier of the parameter.
     * @since 2.1M1
     */
    String getId();

    /**
     * @return the display name of the parameter.
     * @since 2.1M1
     */
    String getName();

    /**
     * @return the description of the parameter.
     */
    String getDescription();

    /**
     * @return the type of the parameter.
     * @deprecated since 3.0M1 use {@link #getParameterType()} instead
     */
    @Deprecated
    Class<?> getType();

    /**
     * @return the type of the property.
     * @since 3.0M1
     */
    Type getParameterType();

    /**
     * @return the default value of the parameter.
     */
    Object getDefaultValue();

    /**
     * @return indicate if the parameter is mandatory.
     * @since 1.7
     */
    boolean isMandatory();
}

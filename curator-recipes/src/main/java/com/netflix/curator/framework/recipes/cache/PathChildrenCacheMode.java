/*
 * Copyright 2012 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.curator.framework.recipes.cache;

import com.netflix.curator.framework.CuratorFramework;
import java.util.concurrent.ThreadFactory;

public enum PathChildrenCacheMode
{
    /**
     * The cache will hold all the children, the data for each child node
     * and the stat for each child node
     */
    CACHE_DATA_AND_STAT,

    /**
     * The cache will hold all the children and the data for each child node.
     * {@link ChildData#getStat()} will return <code>null</code>.
     */
    CACHE_DATA,

    /**
     * The cache will hold only the children path names.
     * {@link ChildData#getStat()} and {@link ChildData#getData()} will both return <code>null</code>.
     */
    CACHE_PATHS_ONLY
}

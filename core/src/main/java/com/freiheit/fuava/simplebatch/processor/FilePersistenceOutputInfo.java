/**
 * Copyright 2015 freiheit.com technologies gmbh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.freiheit.fuava.simplebatch.processor;

import java.nio.file.Path;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

public class FilePersistenceOutputInfo {
    private final Path dataFile;

    public FilePersistenceOutputInfo( final Path dataFile ) {
        this.dataFile = Preconditions.checkNotNull( dataFile );
    }

    public Path getDataFile() {
        return dataFile;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper( this ).add( "Data File", dataFile ).toString();
    }
}
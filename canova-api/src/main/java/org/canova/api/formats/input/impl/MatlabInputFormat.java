/*
 *
 *  *
 *  *  * Copyright 2015 Skymind,Inc.
 *  *  *
 *  *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *    you may not use this file except in compliance with the License.
 *  *  *    You may obtain a copy of the License at
 *  *  *
 *  *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  *    Unless required by applicable law or agreed to in writing, software
 *  *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *    See the License for the specific language governing permissions and
 *  *  *    limitations under the License.
 *  *
 *
 */

package org.canova.api.formats.input.impl;

import org.canova.api.conf.Configuration;
import org.canova.api.formats.input.BaseInputFormat;
import org.canova.api.records.reader.RecordReader;
import org.canova.api.records.reader.impl.MatlabRecordReader;
import org.canova.api.split.InputSplit;


import java.io.IOException;

/**
 * Matlab input format
 *
 * @author Adam Gibson
 */
public class MatlabInputFormat extends BaseInputFormat {
    @Override
    public RecordReader createReader(InputSplit split, Configuration conf) throws IOException, InterruptedException {
        return createReader(split);
    }

    @Override
    public RecordReader createReader(InputSplit split) throws IOException, InterruptedException {
        RecordReader reader = new MatlabRecordReader();
        reader.initialize(split);
        return reader;
    }

}

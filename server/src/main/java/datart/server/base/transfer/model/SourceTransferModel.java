/*
 * Datart
 * <p>
 * Copyright 2021
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package datart.server.base.transfer.model;

import datart.core.entity.Source;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class SourceTransferModel extends ResourceTransferModel {

    private List<MainModel> mainModels;

    private List<Source> parents;

    @Override
    public String getVizName() {
        return mainModels.get(0).source.getName();
    }

    @Data
    public static class MainModel  implements Serializable {
        private Source source;
        private Map<String, byte[]> files;
    }
}

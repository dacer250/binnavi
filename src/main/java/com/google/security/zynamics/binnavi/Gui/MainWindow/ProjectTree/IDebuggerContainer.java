// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.MainWindow.ProjectTree;

import java.util.List;

import com.google.security.zynamics.binnavi.debug.debugger.DebuggerTemplate;


/**
 * Interface for objects that want to provide access to their debuggers.
 */
public interface IDebuggerContainer {
  /**
   * Adds a listener object that is notified about changes to the available debuggers.
   * 
   * @param listener The listener object to add.
   */
  void addListener(IDebuggerContainerListener listener);

  /**
   * Returns all available debuggers.
   * 
   * @return A list of debuggers.
   */
  List<DebuggerTemplate> getDebuggers();
}

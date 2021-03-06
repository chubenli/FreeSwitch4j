/*
 * Copyright 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.freeswitch.command;

import java.util.UUID;

/**
 * MyEvents. The 'myevents' subscription allows your inbound socket connection
 * to behave like an outbound socket connect. It will "lock on" to the event
 * for a particular uuid and will ignore all other event, closing the socket
 * when the channel goes away or closing the channel when the socket disconnects
 * and all applications have finished executing
 *
 * @author Arsene Tochemey GANDOTE
 */
public class MyEventsCommand extends BaseCommand {

    public MyEventsCommand(UUID channelId) {
        this._command = channelId.toString();
    }

    @Override
    public String argument() {
        return this._command;
    }

    @Override
    public String command() {
        return "myevents";
    }

}

/*
 * Copyright 2019 Paralelni Polis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.paralelnipolis.obcanka.desktop.app;

import cz.paralelnipolis.obcanka.core.network.Client;
import cz.paralelnipolis.obcanka.core.scripting.*;
import cz.paralelnipolis.obcanka.core.scripting.cmd.CmdAPDU;
import cz.paralelnipolis.obcanka.desktop.lib.DesktopCardInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates how to login into eidentita.cz
 */
public class Authenticate {
    public static void main(String[] args) {
        DesktopCardInterface ci = DesktopCardInterface.create();
        boolean result = authenticate(ci);
        if (result) {
            System.out.println("Congratulations! You are successfully authenticated.");
        }else{
            System.out.println("Authentication failed.");
        }
    }

    private static boolean authenticate(DesktopCardInterface ci) {

		/*CmdAPDU cmd = new CmdAPDU(new Label({0x00,0x01}));


		List<ICommand> commands = new ArrayList<>();
		commands.add(command)

		Algorithm alg = new Algorithm(Algorithm.SHA256);


		Script s = new Script(commands);

		ScriptEnvelope se = new ScriptEnvelope(alg);*/

        ScriptExecutor executor = new ScriptExecutor(ci);
        Client client = new Client();



        ScriptPlayer player = new ScriptPlayer(executor, client);


        return player.start();
    }
}

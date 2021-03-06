// Copyright 2009 Warsaw University, Faculty of Physics
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package multiplexer.jmx.server;

import java.util.ArrayList;
import java.util.List;

import org.kohsuke.args4j.Option;

/**
 * @author Piotr Findeisen
 */
public class Options {
	@Option(name = "-host", usage = "local bind address (default 0.0.0.0)")
	public String localHost = "0.0.0.0";

	@Option(name = "-port", usage = "local bind port (default 1980)")
	public int localPort = 1980;

	@Option(name = "-rules", usage = "rules file (may be repeated)")
	public List<String> rulesFiles = new ArrayList<String>();
	
	@Option(name="-print", usage="how often print transfer statistics (in millis; default 10000)")
	public long transferUpdateIntervalMillis = 10000;
}

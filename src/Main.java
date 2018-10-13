/*
      Java parser by Maksim Filipiuk (next. Java parser). Using the GSON library.
      Copyright (c) 2018 by Maksim Filipiuk (devMax) <maksim.filipiuk@gmail.com>

      This file is part of Java parser.

      Java parser is free software: you can redistribute it and/or
      modify it under the terms of the GNU General Public License as
      published by the Free Software Foundation; either version 2 of
      the License, or (at your option) any later version.

      Java parser is distributed in the hope that it will be
      useful, but WITHOUT ANY WARRANTY; without even the implied
      warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
      PURPOSE. See the GNU General Public License for more details.

      You should have received a copy of the GNU General Public
      License along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

import com.google.gson.*;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://freegeoip.app/json/");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        Result result = new Gson().fromJson(reader, Result.class);
        System.out.println(
                "IP: " + result.ip +
                "\nCountry code: " + result.country_code +
                "\nCountry name: " + result.country_name +
                "\nCity: " + result.city +
                "\nRegion code: " + result.region_code +
                "\nRegion name: " + result.region_name +
                "\nZIP Code: " + result.zip_code
        );
    }
}
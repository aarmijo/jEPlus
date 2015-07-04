/***************************************************************************
 *   jEPlus - EnergyPlus shell for parametric studies                      *
 *   Copyright (C) 2010  Yi Zhang <yizhanguk@gmail.com>                    *
 *                                                                         *
 *   This program is free software: you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation, either version 3 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>. *
 *                                                                         *
 ***************************************************************************
 *                                                                         *
 * Change log:                                                             *
 *                                                                         *
 *  - Created                                                              *
 *                                                                         *
 ***************************************************************************/
package jeplus.data;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author zyyz
 */
public class RandomSource {
    
    protected static long Seed = new Date().getTime();
    protected static Random Generator = new Random (Seed);

    public static long getSeed() {
        return Seed;
    }

    public static void setSeed(long Seed) {
        RandomSource.Seed = (Seed > 0) ? Seed : new Date().getTime();
        Generator.setSeed(RandomSource.Seed);
    }
    
    public static void initRandomGenerator () {
        Generator = new Random(Seed);
    }
    
    public static Random getRandomGenerator () {
        return Generator;
    }
    
    public static Random getRandomGenerator (long seed) {
        return new Random ((seed > 0) ? seed : new Date().getTime());
    }
    
}

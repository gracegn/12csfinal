import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelSelect extends World
{
    public levelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prepareBG();
        prepare();
    }
    
    public void prepare()
    {
        BackMenu backmenu = new BackMenu("black");
        addObject(backmenu,40,25);

        Instructions instructions = new Instructions("black");
        addObject(instructions,150,25);

        Title1 title1 = new Title1("LEVEL SELECT");
        addObject(title1,505,120);

        //found at https://www.iconfinder.com/iconsets/controls-essential
        level1 level1 = new level1();
        addObject(level1,270,320);
        
        level2 level2 = new level2();
        addObject(level2,500,320);
        
        level3 level3 = new level3();
        addObject(level3,730,320);
        
        level4 level4 = new level4();
        addObject(level4,375,500);
        
        level5 level5 = new level5();
        addObject(level5,615,500);
    }
    
    //draws background
    private void prepareBG()
    {
        squareBG squarebg = new squareBG();
        addObject(squarebg,32,32);

        squareBG squarebg2 = new squareBG();
        addObject(squarebg2,32,72);

        squareBG squarebg3 = new squareBG();
        addObject(squarebg3,32,112);

        squareBG squarebg4 = new squareBG();
        addObject(squarebg4,32,152);

        squareBG squarebg5 = new squareBG();
        addObject(squarebg5,32,192);

        squareBG squarebg6 = new squareBG();
        addObject(squarebg6,32,232);

        squareBG squarebg7 = new squareBG();
        addObject(squarebg7,32,272);

        squareBG squarebg8 = new squareBG();
        addObject(squarebg8,32,312);

        squareBG squarebg9 = new squareBG();
        addObject(squarebg9,32,352);

        squareBG squarebg10 = new squareBG();
        addObject(squarebg10,32,392);

        //
        //
        //

        squareBG squarebg171 = new squareBG();
        addObject(squarebg171,32,432);

        squareBG squarebg172 = new squareBG();
        addObject(squarebg172,32,472);

        squareBG squarebg173 = new squareBG();
        addObject(squarebg173,32,512);

        squareBG squarebg174 = new squareBG();
        addObject(squarebg174,32,552);

        squareBG squarebg175 = new squareBG();
        addObject(squarebg175,32,592);

        squareBG squarebg176 = new squareBG();
        addObject(squarebg176,32,632);

        squareBG squarebg177 = new squareBG();
        addObject(squarebg177,32,672);

        //************************************************************************

        squareBG squarebg11 = new squareBG();
        addObject(squarebg11,72,32);

        squareBG squarebg12 = new squareBG();
        addObject(squarebg12,72,72);

        squareBG squarebg13 = new squareBG();
        addObject(squarebg13,72,112);

        squareBG squarebg14 = new squareBG();
        addObject(squarebg14,72,152);

        squareBG squarebg15 = new squareBG();
        addObject(squarebg15,72,192);

        squareBG squarebg16 = new squareBG();
        addObject(squarebg16,72,232);

        squareBG squarebg17 = new squareBG();
        addObject(squarebg17,72,272);

        squareBG squarebg18 = new squareBG();
        addObject(squarebg18,72,312);

        squareBG squarebg19 = new squareBG();
        addObject(squarebg19,72,352);

        squareBG squarebg20 = new squareBG();
        addObject(squarebg20,72,392);

        //
        //
        //

        squareBG squarebg178 = new squareBG();
        addObject(squarebg178,72,432);

        squareBG squarebg179 = new squareBG();
        addObject(squarebg179,72,472);

        squareBG squarebg180 = new squareBG();
        addObject(squarebg180,72,512);

        squareBG squarebg181 = new squareBG();
        addObject(squarebg181,72,552);

        squareBG squarebg182 = new squareBG();
        addObject(squarebg182,72,592);

        squareBG squarebg183 = new squareBG();
        addObject(squarebg183,72,632);

        squareBG squarebg184 = new squareBG();
        addObject(squarebg184,72,672);

        //************************************************************************

        squareBG squarebg21 = new squareBG();
        addObject(squarebg21,112,32);

        squareBG squarebg22 = new squareBG();
        addObject(squarebg22,112,72);

        squareBG squarebg23 = new squareBG();
        addObject(squarebg23,112,112);

        squareBG squarebg24 = new squareBG();
        addObject(squarebg24,112,152);

        squareBG squarebg25 = new squareBG();
        addObject(squarebg25,112,192);

        squareBG squarebg26 = new squareBG();
        addObject(squarebg26,112,232);

        squareBG squarebg27 = new squareBG();
        addObject(squarebg27,112,272);

        squareBG squarebg28 = new squareBG();
        addObject(squarebg28,112,312);

        squareBG squarebg29 = new squareBG();
        addObject(squarebg29,112,352);

        squareBG squarebg30 = new squareBG();
        addObject(squarebg30,112,392);

        //
        //
        //

        squareBG squarebg185 = new squareBG();
        addObject(squarebg185,112,432);

        squareBG squarebg186 = new squareBG();
        addObject(squarebg186,112,472);

        squareBG squarebg187 = new squareBG();
        addObject(squarebg187,112,512);

        squareBG squarebg188 = new squareBG();
        addObject(squarebg188,112,552);

        squareBG squarebg189 = new squareBG();
        addObject(squarebg189,112,592);

        squareBG squarebg190 = new squareBG();
        addObject(squarebg190,112,632);

        squareBG squarebg191 = new squareBG();
        addObject(squarebg191,112,672);

        //************************************************************************

        squareBG squarebg31 = new squareBG();
        addObject(squarebg31,152,32);

        squareBG squarebg32 = new squareBG();
        addObject(squarebg32,152,72);

        squareBG squarebg33 = new squareBG();
        addObject(squarebg33,152,112);

        squareBG squarebg34 = new squareBG();
        addObject(squarebg34,152,152);

        squareBG squarebg35 = new squareBG();
        addObject(squarebg35,152,192);

        squareBG squarebg36 = new squareBG();
        addObject(squarebg36,152,232);

        squareBG squarebg37 = new squareBG();
        addObject(squarebg37,152,272);

        squareBG squarebg38 = new squareBG();
        addObject(squarebg38,152,312);

        squareBG squarebg39 = new squareBG();
        addObject(squarebg39,152,352);

        squareBG squarebg40 = new squareBG();
        addObject(squarebg40,152,392);

        //
        //
        //

        squareBG squarebg192 = new squareBG();
        addObject(squarebg192,152,432);

        squareBG squarebg193 = new squareBG();
        addObject(squarebg193,152,472);

        squareBG squarebg194 = new squareBG();
        addObject(squarebg194,152,512);

        squareBG squarebg195 = new squareBG();
        addObject(squarebg195,152,552);

        squareBG squarebg196 = new squareBG();
        addObject(squarebg196,152,592);

        squareBG squarebg197 = new squareBG();
        addObject(squarebg197,152,632);

        squareBG squarebg198 = new squareBG();
        addObject(squarebg198,152,672);

        //************************************************************************

        squareBG squarebg51 = new squareBG();
        addObject(squarebg51,192,32);

        squareBG squarebg52 = new squareBG();
        addObject(squarebg52,192,72);

        squareBG squarebg53 = new squareBG();
        addObject(squarebg53,192,112);

        squareBG squarebg54 = new squareBG();
        addObject(squarebg54,192,152);

        squareBG squarebg55 = new squareBG();
        addObject(squarebg55,192,192);

        squareBG squarebg56 = new squareBG();
        addObject(squarebg56,192,232);

        squareBG squarebg57 = new squareBG();
        addObject(squarebg57,192,272);

        squareBG squarebg58 = new squareBG();
        addObject(squarebg58,192,312);

        squareBG squarebg59 = new squareBG();
        addObject(squarebg59,192,352);

        squareBG squarebg60 = new squareBG();
        addObject(squarebg60,192,392);

        //
        //
        //

        squareBG squarebg199 = new squareBG();
        addObject(squarebg199,192,432);

        squareBG squarebg200 = new squareBG();
        addObject(squarebg200,192,472);

        squareBG squarebg201 = new squareBG();
        addObject(squarebg201,192,512);

        squareBG squarebg202 = new squareBG();
        addObject(squarebg202,192,552);

        squareBG squarebg203 = new squareBG();
        addObject(squarebg203,192,592);

        squareBG squarebg204 = new squareBG();
        addObject(squarebg204,192,632);

        squareBG squarebg205 = new squareBG();
        addObject(squarebg205,192,672);

        //************************************************************************

        squareBG squarebg71 = new squareBG();
        addObject(squarebg71,232,32);

        squareBG squarebg72 = new squareBG();
        addObject(squarebg72,232,72);

        squareBG squarebg73 = new squareBG();
        addObject(squarebg73,232,112);

        squareBG squarebg74 = new squareBG();
        addObject(squarebg74,232,152);

        squareBG squarebg75 = new squareBG();
        addObject(squarebg75,232,192);

        squareBG squarebg76 = new squareBG();
        addObject(squarebg76,232,232);

        squareBG squarebg77 = new squareBG();
        addObject(squarebg77,232,272);

        squareBG squarebg78 = new squareBG();
        addObject(squarebg78,232,312);

        squareBG squarebg79 = new squareBG();
        addObject(squarebg79,232,352);

        squareBG squarebg80 = new squareBG();
        addObject(squarebg80,232,392);

        //
        //
        //

        squareBG squarebg206 = new squareBG();
        addObject(squarebg206,232,432);

        squareBG squarebg207 = new squareBG();
        addObject(squarebg207,232,472);

        squareBG squarebg208 = new squareBG();
        addObject(squarebg208,232,512);

        squareBG squarebg209 = new squareBG();
        addObject(squarebg209,232,552);

        squareBG squarebg210 = new squareBG();
        addObject(squarebg210,232,592);

        squareBG squarebg211 = new squareBG();
        addObject(squarebg211,232,632);

        squareBG squarebg212 = new squareBG();
        addObject(squarebg212,232,672);

        //************************************************************************

        squareBG squarebg81 = new squareBG();
        addObject(squarebg81,272,32);

        squareBG squarebg82 = new squareBG();
        addObject(squarebg82,272,72);

        squareBG squarebg83 = new squareBG();
        addObject(squarebg83,272,112);

        squareBG squarebg84 = new squareBG();
        addObject(squarebg84,272,152);

        squareBG squarebg85 = new squareBG();
        addObject(squarebg85,272,192);

        squareBG squarebg86 = new squareBG();
        addObject(squarebg86,272,232);

        squareBG squarebg87 = new squareBG();
        addObject(squarebg87,272,272);

        squareBG squarebg88 = new squareBG();
        addObject(squarebg88,272,312);

        squareBG squarebg89 = new squareBG();
        addObject(squarebg89,272,352);

        squareBG squarebg90 = new squareBG();
        addObject(squarebg90,272,392);

        //
        //
        //

        squareBG squarebg213 = new squareBG();
        addObject(squarebg213,272,432);

        squareBG squarebg214 = new squareBG();
        addObject(squarebg214,272,472);

        squareBG squarebg215 = new squareBG();
        addObject(squarebg215,272,512);

        squareBG squarebg216 = new squareBG();
        addObject(squarebg216,272,552);

        squareBG squarebg217 = new squareBG();
        addObject(squarebg217,272,592);

        squareBG squarebg218 = new squareBG();
        addObject(squarebg218,272,632);

        squareBG squarebg219 = new squareBG();
        addObject(squarebg219,272,672);

        //************************************************************************

        squareBG squarebg91 = new squareBG();
        addObject(squarebg91,312,32);

        squareBG squarebg92 = new squareBG();
        addObject(squarebg92,312,72);

        squareBG squarebg93 = new squareBG();
        addObject(squarebg93,312,112);

        squareBG squarebg94 = new squareBG();
        addObject(squarebg94,312,152);

        squareBG squarebg95 = new squareBG();
        addObject(squarebg95,312,192);

        squareBG squarebg96 = new squareBG();
        addObject(squarebg96,312,232);

        squareBG squarebg97 = new squareBG();
        addObject(squarebg97,312,272);

        squareBG squarebg98 = new squareBG();
        addObject(squarebg98,312,312);

        squareBG squarebg99 = new squareBG();
        addObject(squarebg99,312,352);

        squareBG squarebg100 = new squareBG();
        addObject(squarebg100,312,392);

        //
        //
        //

        squareBG squarebg220 = new squareBG();
        addObject(squarebg220,312,432);

        squareBG squarebg221 = new squareBG();
        addObject(squarebg221,312,472);

        squareBG squarebg222 = new squareBG();
        addObject(squarebg222,312,512);

        squareBG squarebg223 = new squareBG();
        addObject(squarebg223,312,552);

        squareBG squarebg224 = new squareBG();
        addObject(squarebg224,312,592);

        squareBG squarebg225 = new squareBG();
        addObject(squarebg225,312,632);

        squareBG squarebg226 = new squareBG();
        addObject(squarebg226,312,672);

        //************************************************************************

        squareBG squarebg101 = new squareBG();
        addObject(squarebg101,352,32);

        squareBG squarebg102 = new squareBG();
        addObject(squarebg102,352,72);

        squareBG squarebg103 = new squareBG();
        addObject(squarebg103,352,112);

        squareBG squarebg104 = new squareBG();
        addObject(squarebg104,352,152);

        squareBG squarebg105 = new squareBG();
        addObject(squarebg105,352,192);

        squareBG squarebg106 = new squareBG();
        addObject(squarebg106,352,232);

        squareBG squarebg107 = new squareBG();
        addObject(squarebg107,352,272);

        squareBG squarebg108 = new squareBG();
        addObject(squarebg108,352,312);

        squareBG squarebg109 = new squareBG();
        addObject(squarebg109,352,352);

        squareBG squarebg110 = new squareBG();
        addObject(squarebg110,352,392);

        //
        //
        //

        squareBG squarebg227 = new squareBG();
        addObject(squarebg227,352,432);

        squareBG squarebg228 = new squareBG();
        addObject(squarebg228,352,472);

        squareBG squarebg229 = new squareBG();
        addObject(squarebg229,352,512);

        squareBG squarebg230 = new squareBG();
        addObject(squarebg230,352,552);

        squareBG squarebg231 = new squareBG();
        addObject(squarebg231,352,592);

        squareBG squarebg232 = new squareBG();
        addObject(squarebg232,352,632);

        squareBG squarebg233 = new squareBG();
        addObject(squarebg233,352,672);

        //************************************************************************

        squareBG squarebg111 = new squareBG();
        addObject(squarebg111,392,32);

        squareBG squarebg112 = new squareBG();
        addObject(squarebg112,392,72);

        squareBG squarebg113 = new squareBG();
        addObject(squarebg113,392,112);

        squareBG squarebg114 = new squareBG();
        addObject(squarebg114,392,152);

        squareBG squarebg115 = new squareBG();
        addObject(squarebg115,392,192);

        squareBG squarebg116 = new squareBG();
        addObject(squarebg116,392,232);

        squareBG squarebg117 = new squareBG();
        addObject(squarebg117,392,272);

        squareBG squarebg118 = new squareBG();
        addObject(squarebg118,392,312);

        squareBG squarebg119 = new squareBG();
        addObject(squarebg119,392,352);

        squareBG squarebg120 = new squareBG();
        addObject(squarebg120,392,392);

        //
        //
        //

        squareBG squarebg240 = new squareBG();
        addObject(squarebg240,392,432);

        squareBG squarebg234 = new squareBG();
        addObject(squarebg234,392,472);

        squareBG squarebg235 = new squareBG();
        addObject(squarebg235,392,512);

        squareBG squarebg236 = new squareBG();
        addObject(squarebg236,392,552);

        squareBG squarebg237 = new squareBG();
        addObject(squarebg237,392,592);

        squareBG squarebg238 = new squareBG();
        addObject(squarebg238,392,632);

        squareBG squarebg239 = new squareBG();
        addObject(squarebg239,392,672);

        //************************************************************************

        squareBG squarebg121 = new squareBG();
        addObject(squarebg121,432,32);

        squareBG squarebg122 = new squareBG();
        addObject(squarebg122,432,72);

        squareBG squarebg123 = new squareBG();
        addObject(squarebg123,432,112);

        squareBG squarebg124 = new squareBG();
        addObject(squarebg124,432,152);

        squareBG squarebg125 = new squareBG();
        addObject(squarebg125,432,192);

        squareBG squarebg126 = new squareBG();
        addObject(squarebg126,432,232);

        squareBG squarebg127 = new squareBG();
        addObject(squarebg127,432,272);

        squareBG squarebg128 = new squareBG();
        addObject(squarebg128,432,312);

        squareBG squarebg129 = new squareBG();
        addObject(squarebg129,432,352);

        squareBG squarebg130 = new squareBG();
        addObject(squarebg130,432,392);

        //
        //
        //

        squareBG squarebg243 = new squareBG();
        addObject(squarebg243,432,432);

        squareBG squarebg244 = new squareBG();
        addObject(squarebg244,432,472);

        squareBG squarebg245 = new squareBG();
        addObject(squarebg245,432,512);

        squareBG squarebg246 = new squareBG();
        addObject(squarebg246,432,552);

        squareBG squarebg247 = new squareBG();
        addObject(squarebg247,432,592);

        squareBG squarebg241 = new squareBG();
        addObject(squarebg241,432,632);

        squareBG squarebg242 = new squareBG();
        addObject(squarebg242,432,672);

        //************************************************************************

        squareBG squarebg131 = new squareBG();
        addObject(squarebg131,472,32);

        squareBG squarebg132 = new squareBG();
        addObject(squarebg132,472,72);

        squareBG squarebg133 = new squareBG();
        addObject(squarebg133,472,112);

        squareBG squarebg134 = new squareBG();
        addObject(squarebg134,472,152);

        squareBG squarebg135 = new squareBG();
        addObject(squarebg135,472,192);

        squareBG squarebg136 = new squareBG();
        addObject(squarebg136,472,232);

        squareBG squarebg137 = new squareBG();
        addObject(squarebg137,472,272);

        squareBG squarebg138 = new squareBG();
        addObject(squarebg138,472,312);

        squareBG squarebg139 = new squareBG();
        addObject(squarebg139,472,352);

        squareBG squarebg140 = new squareBG();
        addObject(squarebg140,472,392);

        //
        //
        //

        squareBG squarebg253 = new squareBG();
        addObject(squarebg253,472,432);

        squareBG squarebg254 = new squareBG();
        addObject(squarebg254,472,472);

        squareBG squarebg252 = new squareBG();
        addObject(squarebg252,472,512);

        squareBG squarebg251 = new squareBG();
        addObject(squarebg251,472,552);

        squareBG squarebg250 = new squareBG();
        addObject(squarebg250,472,592);

        squareBG squarebg249 = new squareBG();
        addObject(squarebg249,472,632);

        squareBG squarebg248 = new squareBG();
        addObject(squarebg248,472,672);

        //************************************************************************

        squareBG squarebg141 = new squareBG();
        addObject(squarebg141,512,32);

        squareBG squarebg142 = new squareBG();
        addObject(squarebg142,512,72);

        squareBG squarebg143 = new squareBG();
        addObject(squarebg143,512,112);

        squareBG squarebg144 = new squareBG();
        addObject(squarebg144,512,152);

        squareBG squarebg145 = new squareBG();
        addObject(squarebg145,512,192);

        squareBG squarebg146 = new squareBG();
        addObject(squarebg146,512,232);

        squareBG squarebg147 = new squareBG();
        addObject(squarebg147,512,272);

        squareBG squarebg148 = new squareBG();
        addObject(squarebg148,512,312);

        squareBG squarebg149 = new squareBG();
        addObject(squarebg149,512,352);

        squareBG squarebg150 = new squareBG();
        addObject(squarebg150,512,392);

        //
        //
        //

        squareBG squarebg261 = new squareBG();
        addObject(squarebg261,512,432);

        squareBG squarebg260 = new squareBG();
        addObject(squarebg260,512,472);

        squareBG squarebg255 = new squareBG();
        addObject(squarebg255,512,512);

        squareBG squarebg256 = new squareBG();
        addObject(squarebg256,512,552);

        squareBG squarebg257 = new squareBG();
        addObject(squarebg257,512,592);

        squareBG squarebg258 = new squareBG();
        addObject(squarebg258,512,632);

        squareBG squarebg259 = new squareBG();
        addObject(squarebg259,512,672);

        //************************************************************************

        squareBG squarebg151 = new squareBG();
        addObject(squarebg151,552,32);

        squareBG squarebg152 = new squareBG();
        addObject(squarebg152,552,72);

        squareBG squarebg153 = new squareBG();
        addObject(squarebg153,552,112);

        squareBG squarebg154 = new squareBG();
        addObject(squarebg154,552,152);

        squareBG squarebg155 = new squareBG();
        addObject(squarebg155,552,192);

        squareBG squarebg156 = new squareBG();
        addObject(squarebg156,552,232);

        squareBG squarebg157 = new squareBG();
        addObject(squarebg157,552,272);

        squareBG squarebg158 = new squareBG();
        addObject(squarebg158,552,312);

        squareBG squarebg159 = new squareBG();
        addObject(squarebg159,552,352);

        squareBG squarebg160 = new squareBG();
        addObject(squarebg160,552,392);

        //
        //
        //

        squareBG squarebg263 = new squareBG();
        addObject(squarebg263,552,432);

        squareBG squarebg264 = new squareBG();
        addObject(squarebg264,552,472);

        squareBG squarebg265 = new squareBG();
        addObject(squarebg265,552,512);

        squareBG squarebg266 = new squareBG();
        addObject(squarebg266,552,552);

        squareBG squarebg267 = new squareBG();
        addObject(squarebg267,552,592);

        squareBG squarebg268 = new squareBG();
        addObject(squarebg268,552,632);

        squareBG squarebg262 = new squareBG();
        addObject(squarebg262,552,672);

        //************************************************************************

        squareBG squarebg161 = new squareBG();
        addObject(squarebg161,592,32);

        squareBG squarebg162 = new squareBG();
        addObject(squarebg162,592,72);

        squareBG squarebg163 = new squareBG();
        addObject(squarebg163,592,112);

        squareBG squarebg164 = new squareBG();
        addObject(squarebg164,592,152);

        squareBG squarebg165 = new squareBG();
        addObject(squarebg165,592,192);

        squareBG squarebg166 = new squareBG();
        addObject(squarebg166,592,232);

        squareBG squarebg167 = new squareBG();
        addObject(squarebg167,592,272);

        squareBG squarebg168 = new squareBG();
        addObject(squarebg168,592,312);

        squareBG squarebg169 = new squareBG();
        addObject(squarebg169,592,352);

        squareBG squarebg170 = new squareBG();
        addObject(squarebg170,592,392);

        //
        //
        //

        squareBG squarebg273 = new squareBG();
        addObject(squarebg273,592,432);

        squareBG squarebg274 = new squareBG();
        addObject(squarebg274,592,472);

        squareBG squarebg275 = new squareBG();
        addObject(squarebg275,592,512);

        squareBG squarebg272 = new squareBG();
        addObject(squarebg272,592,552);

        squareBG squarebg271 = new squareBG();
        addObject(squarebg271,592,592);

        squareBG squarebg270 = new squareBG();
        addObject(squarebg270,592,632);

        squareBG squarebg269 = new squareBG();
        addObject(squarebg269,592,672);

        //************************************************************************

        squareBG squarebg290 = new squareBG();
        addObject(squarebg290,632,32);

        squareBG squarebg291 = new squareBG();
        addObject(squarebg291,632,72);

        squareBG squarebg292 = new squareBG();
        addObject(squarebg292,632,112);

        squareBG squarebg293 = new squareBG();
        addObject(squarebg293,632,152);

        squareBG squarebg294 = new squareBG();
        addObject(squarebg294,632,192);

        squareBG squarebg286 = new squareBG();
        addObject(squarebg286,632,232);

        squareBG squarebg287 = new squareBG();
        addObject(squarebg287,632,272);

        squareBG squarebg288 = new squareBG();
        addObject(squarebg288,632,312);

        squareBG squarebg289 = new squareBG();
        addObject(squarebg289,632,352);

        squareBG squarebg280 = new squareBG();
        addObject(squarebg280,632,392);

        //
        //
        //

        squareBG squarebg283 = new squareBG();
        addObject(squarebg283,632,432);

        squareBG squarebg284 = new squareBG();
        addObject(squarebg284,632,472);

        squareBG squarebg285 = new squareBG();
        addObject(squarebg285,632,512);

        squareBG squarebg282 = new squareBG();
        addObject(squarebg282,632,552);

        squareBG squarebg281 = new squareBG();
        addObject(squarebg281,632,592);

        squareBG squarebg295 = new squareBG();
        addObject(squarebg295,632,632);

        squareBG squarebg296 = new squareBG();
        addObject(squarebg296,632,672);

        //************************************************************************

        squareBG squarebg310 = new squareBG();
        addObject(squarebg310,672,32);

        squareBG squarebg311 = new squareBG();
        addObject(squarebg311,672,72);

        squareBG squarebg312 = new squareBG();
        addObject(squarebg312,672,112);

        squareBG squarebg313 = new squareBG();
        addObject(squarebg313,672,152);

        squareBG squarebg314 = new squareBG();
        addObject(squarebg314,672,192);

        squareBG squarebg306 = new squareBG();
        addObject(squarebg306,672,232);

        squareBG squarebg307 = new squareBG();
        addObject(squarebg307,672,272);

        squareBG squarebg308 = new squareBG();
        addObject(squarebg308,672,312);

        squareBG squarebg309 = new squareBG();
        addObject(squarebg309,672,352);

        squareBG squarebg300 = new squareBG();
        addObject(squarebg300,672,392);

        //
        //
        //

        squareBG squarebg303 = new squareBG();
        addObject(squarebg303,672,432);

        squareBG squarebg304 = new squareBG();
        addObject(squarebg304,672,472);

        squareBG squarebg305 = new squareBG();
        addObject(squarebg305,672,512);

        squareBG squarebg302 = new squareBG();
        addObject(squarebg302,672,552);

        squareBG squarebg301 = new squareBG();
        addObject(squarebg301,672,592);

        squareBG squarebg315 = new squareBG();
        addObject(squarebg315,672,632);

        squareBG squarebg316 = new squareBG();
        addObject(squarebg316,672,672);

        //************************************************************************

        squareBG squarebg330 = new squareBG();
        addObject(squarebg330,712,32);

        squareBG squarebg331 = new squareBG();
        addObject(squarebg331,712,72);

        squareBG squarebg332 = new squareBG();
        addObject(squarebg332,712,112);

        squareBG squarebg333 = new squareBG();
        addObject(squarebg333,712,152);

        squareBG squarebg334 = new squareBG();
        addObject(squarebg334,712,192);

        squareBG squarebg326 = new squareBG();
        addObject(squarebg326,712,232);

        squareBG squarebg327 = new squareBG();
        addObject(squarebg327,712,272);

        squareBG squarebg328 = new squareBG();
        addObject(squarebg328,712,312);

        squareBG squarebg329 = new squareBG();
        addObject(squarebg329,712,352);

        squareBG squarebg320 = new squareBG();
        addObject(squarebg320,712,392);

        //
        //
        //

        squareBG squarebg323 = new squareBG();
        addObject(squarebg323,712,432);

        squareBG squarebg324 = new squareBG();
        addObject(squarebg324,712,472);

        squareBG squarebg325 = new squareBG();
        addObject(squarebg325,712,512);

        squareBG squarebg322 = new squareBG();
        addObject(squarebg322,712,552);

        squareBG squarebg321 = new squareBG();
        addObject(squarebg321,712,592);

        squareBG squarebg335 = new squareBG();
        addObject(squarebg335,712,632);

        squareBG squarebg336 = new squareBG();
        addObject(squarebg336,712,672);

        //************************************************************************

        squareBG squarebg350 = new squareBG();
        addObject(squarebg350,752,32);

        squareBG squarebg351 = new squareBG();
        addObject(squarebg351,752,72);

        squareBG squarebg352 = new squareBG();
        addObject(squarebg352,752,112);

        squareBG squarebg353 = new squareBG();
        addObject(squarebg353,752,152);

        squareBG squarebg354 = new squareBG();
        addObject(squarebg354,752,192);

        squareBG squarebg346 = new squareBG();
        addObject(squarebg346,752,232);

        squareBG squarebg347 = new squareBG();
        addObject(squarebg347,752,272);

        squareBG squarebg348 = new squareBG();
        addObject(squarebg348,752,312);

        squareBG squarebg349 = new squareBG();
        addObject(squarebg349,752,352);

        squareBG squarebg340 = new squareBG();
        addObject(squarebg340,752,392);

        //
        //
        //

        squareBG squarebg343 = new squareBG();
        addObject(squarebg343,752,432);

        squareBG squarebg344 = new squareBG();
        addObject(squarebg344,752,472);

        squareBG squarebg345 = new squareBG();
        addObject(squarebg345,752,512);

        squareBG squarebg342 = new squareBG();
        addObject(squarebg342,752,552);

        squareBG squarebg341 = new squareBG();
        addObject(squarebg341,752,592);

        squareBG squarebg355 = new squareBG();
        addObject(squarebg355,752,632);

        squareBG squarebg356 = new squareBG();
        addObject(squarebg356,752,672);

        //************************************************************************

        squareBG squarebg370 = new squareBG();
        addObject(squarebg370,792,32);

        squareBG squarebg371 = new squareBG();
        addObject(squarebg371,792,72);

        squareBG squarebg372 = new squareBG();
        addObject(squarebg372,792,112);

        squareBG squarebg373 = new squareBG();
        addObject(squarebg373,792,152);

        squareBG squarebg374 = new squareBG();
        addObject(squarebg374,792,192);

        squareBG squarebg366 = new squareBG();
        addObject(squarebg366,792,232);

        squareBG squarebg367 = new squareBG();
        addObject(squarebg367,792,272);

        squareBG squarebg368 = new squareBG();
        addObject(squarebg368,792,312);

        squareBG squarebg369 = new squareBG();
        addObject(squarebg369,792,352);

        squareBG squarebg360 = new squareBG();
        addObject(squarebg360,792,392);

        //
        //
        //

        squareBG squarebg363 = new squareBG();
        addObject(squarebg363,792,432);

        squareBG squarebg364 = new squareBG();
        addObject(squarebg364,792,472);

        squareBG squarebg365 = new squareBG();
        addObject(squarebg365,792,512);

        squareBG squarebg362 = new squareBG();
        addObject(squarebg362,792,552);

        squareBG squarebg361 = new squareBG();
        addObject(squarebg361,792,592);

        squareBG squarebg375 = new squareBG();
        addObject(squarebg375,792,632);

        squareBG squarebg376 = new squareBG();
        addObject(squarebg376,792,672);

        //************************************************************************

        squareBG squarebg390 = new squareBG();
        addObject(squarebg390,832,32);

        squareBG squarebg391 = new squareBG();
        addObject(squarebg391,832,72);

        squareBG squarebg392 = new squareBG();
        addObject(squarebg392,832,112);

        squareBG squarebg393 = new squareBG();
        addObject(squarebg393,832,152);

        squareBG squarebg394 = new squareBG();
        addObject(squarebg394,832,192);

        squareBG squarebg386 = new squareBG();
        addObject(squarebg386,832,232);

        squareBG squarebg387 = new squareBG();
        addObject(squarebg387,832,272);

        squareBG squarebg388 = new squareBG();
        addObject(squarebg388,832,312);

        squareBG squarebg389 = new squareBG();
        addObject(squarebg389,832,352);

        squareBG squarebg380 = new squareBG();
        addObject(squarebg380,832,392);

        //
        //
        //

        squareBG squarebg383 = new squareBG();
        addObject(squarebg383,832,432);

        squareBG squarebg384 = new squareBG();
        addObject(squarebg384,832,472);

        squareBG squarebg385 = new squareBG();
        addObject(squarebg385,832,512);

        squareBG squarebg382 = new squareBG();
        addObject(squarebg382,832,552);

        squareBG squarebg381 = new squareBG();
        addObject(squarebg381,832,592);

        squareBG squarebg395 = new squareBG();
        addObject(squarebg395,832,632);

        squareBG squarebg396 = new squareBG();
        addObject(squarebg396,832,672);

        //************************************************************************

        squareBG squarebg410 = new squareBG();
        addObject(squarebg410,872,32);

        squareBG squarebg411 = new squareBG();
        addObject(squarebg411,872,72);

        squareBG squarebg412 = new squareBG();
        addObject(squarebg412,872,112);

        squareBG squarebg413 = new squareBG();
        addObject(squarebg413,872,152);

        squareBG squarebg414 = new squareBG();
        addObject(squarebg414,872,192);

        squareBG squarebg406 = new squareBG();
        addObject(squarebg406,872,232);

        squareBG squarebg407 = new squareBG();
        addObject(squarebg407,872,272);

        squareBG squarebg408 = new squareBG();
        addObject(squarebg408,872,312);

        squareBG squarebg409 = new squareBG();
        addObject(squarebg409,872,352);

        squareBG squarebg400 = new squareBG();
        addObject(squarebg400,872,392);

        //
        //
        //

        squareBG squarebg403 = new squareBG();
        addObject(squarebg403,872,432);

        squareBG squarebg404 = new squareBG();
        addObject(squarebg404,872,472);

        squareBG squarebg405 = new squareBG();
        addObject(squarebg405,872,512);

        squareBG squarebg402 = new squareBG();
        addObject(squarebg402,872,552);

        squareBG squarebg401 = new squareBG();
        addObject(squarebg401,872,592);

        squareBG squarebg415 = new squareBG();
        addObject(squarebg415,872,632);

        squareBG squarebg416 = new squareBG();
        addObject(squarebg416,872,672);

        //************************************************************************

        squareBG squarebg430 = new squareBG();
        addObject(squarebg430,912,32);

        squareBG squarebg431 = new squareBG();
        addObject(squarebg431,912,72);

        squareBG squarebg432 = new squareBG();
        addObject(squarebg432,912,112);

        squareBG squarebg433 = new squareBG();
        addObject(squarebg433,912,152);

        squareBG squarebg434 = new squareBG();
        addObject(squarebg434,912,192);

        squareBG squarebg426 = new squareBG();
        addObject(squarebg426,912,232);

        squareBG squarebg427 = new squareBG();
        addObject(squarebg427,912,272);

        squareBG squarebg428 = new squareBG();
        addObject(squarebg428,912,312);

        squareBG squarebg429 = new squareBG();
        addObject(squarebg429,912,352);

        squareBG squarebg420 = new squareBG();
        addObject(squarebg420,912,392);

        //
        //
        //

        squareBG squarebg423 = new squareBG();
        addObject(squarebg423,912,432);

        squareBG squarebg424 = new squareBG();
        addObject(squarebg424,912,472);

        squareBG squarebg425 = new squareBG();
        addObject(squarebg425,912,512);

        squareBG squarebg422 = new squareBG();
        addObject(squarebg422,912,552);

        squareBG squarebg421 = new squareBG();
        addObject(squarebg421,912,592);

        squareBG squarebg435 = new squareBG();
        addObject(squarebg435,912,632);

        squareBG squarebg436 = new squareBG();
        addObject(squarebg436,912,672);

        //************************************************************************

        squareBG squarebg450 = new squareBG();
        addObject(squarebg450,952,32);

        squareBG squarebg451 = new squareBG();
        addObject(squarebg451,952,72);

        squareBG squarebg452 = new squareBG();
        addObject(squarebg452,952,112);

        squareBG squarebg453 = new squareBG();
        addObject(squarebg453,952,152);

        squareBG squarebg454 = new squareBG();
        addObject(squarebg454,952,192);

        squareBG squarebg446 = new squareBG();
        addObject(squarebg446,952,232);

        squareBG squarebg447 = new squareBG();
        addObject(squarebg447,952,272);

        squareBG squarebg448 = new squareBG();
        addObject(squarebg448,952,312);

        squareBG squarebg449 = new squareBG();
        addObject(squarebg449,952,352);

        squareBG squarebg440 = new squareBG();
        addObject(squarebg440,952,392);

        //
        //
        //

        squareBG squarebg443 = new squareBG();
        addObject(squarebg443,952,432);

        squareBG squarebg444 = new squareBG();
        addObject(squarebg444,952,472);

        squareBG squarebg445 = new squareBG();
        addObject(squarebg445,952,512);

        squareBG squarebg442 = new squareBG();
        addObject(squarebg442,952,552);

        squareBG squarebg441 = new squareBG();
        addObject(squarebg441,952,592);

        squareBG squarebg455 = new squareBG();
        addObject(squarebg455,952,632);

        squareBG squarebg456 = new squareBG();
        addObject(squarebg456,952,672);

        //************************************************************************

        squareBG squarebg470 = new squareBG();
        addObject(squarebg470,992,32);

        squareBG squarebg471 = new squareBG();
        addObject(squarebg471,992,72);

        squareBG squarebg472 = new squareBG();
        addObject(squarebg472,992,112);

        squareBG squarebg473 = new squareBG();
        addObject(squarebg473,992,152);

        squareBG squarebg474 = new squareBG();
        addObject(squarebg474,992,192);

        squareBG squarebg466 = new squareBG();
        addObject(squarebg466,992,232);

        squareBG squarebg467 = new squareBG();
        addObject(squarebg467,992,272);

        squareBG squarebg468 = new squareBG();
        addObject(squarebg468,992,312);

        squareBG squarebg469 = new squareBG();
        addObject(squarebg469,992,352);

        squareBG squarebg460 = new squareBG();
        addObject(squarebg460,992,392);

        //
        //
        //

        squareBG squarebg463 = new squareBG();
        addObject(squarebg463,992,432);

        squareBG squarebg464 = new squareBG();
        addObject(squarebg464,992,472);

        squareBG squarebg465 = new squareBG();
        addObject(squarebg465,992,512);

        squareBG squarebg462 = new squareBG();
        addObject(squarebg462,992,552);

        squareBG squarebg461 = new squareBG();
        addObject(squarebg461,992,592);

        squareBG squarebg475 = new squareBG();
        addObject(squarebg475,992,632);

        squareBG squarebg476 = new squareBG();
        addObject(squarebg476,992,672);
    }
}

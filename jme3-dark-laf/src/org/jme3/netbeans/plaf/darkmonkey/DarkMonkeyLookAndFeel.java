/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jme3.netbeans.plaf.darkmonkey;

import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import org.openide.util.NbPreferences;

/**
 * The DarkMonkey look and feel class Extends the Nimrod LAF, which in turn,
 * extends Metal.  The version of Nimrod used is 1.2b obtained from: <br/>
 * <a src="http://nilogonzalez.es/nimrodlf/download-en.html">
 * http://nilogonzalez.es/nimrodlf/download-en.html</a>
 * <p> A copy of the jar and source used for this project is in the ext/ folder.
 * </p>
 * 
 * @author Charles Anderson
 */
public class DarkMonkeyLookAndFeel extends com.nilo.plaf.nimrod.NimRODLookAndFeel{
    
    public static final String dmLAFDefault = "DarkMonkey.theme";
    protected static NimRODTheme nrTheme = new NimRODTheme();
    
    public DarkMonkeyLookAndFeel(){
        super();
        // Todo: replace following code with proper loading
        //  From DarkMonkey.theme
        // This replaces getXYZTheme(), they will be seperate Files
        
        try {
            if (NbPreferences.root().nodeExists("laf")) {
                String color = NbPreferences.root().node("laf").get("darkmonkey.color", null);
                if (color == null) { /* Create key with default value */
                    NbPreferences.root().node("laf").put("darkmonkey.color", "blue");
                    color = "blue";
                }
                
                switch (color.toLowerCase()) {
                    case "blue":
                        setCurrentTheme(getBlueTheme());
                        break;
                        
                    case "yellow":
                        setCurrentTheme(getYellowTheme());
                        break;
                        
                    case "legacy":
                        setCurrentTheme(getLegacyTheme());
                        break;
                        
                    case "debug":
                        setCurrentTheme(getDebugTheme());
                        break;
                }
            } else {
                setCurrentTheme(getBlueTheme());
            }
        } catch (Exception e) {
            setCurrentTheme(getBlueTheme());
        }

    }
    
    /**
     * This method override, getID() returns the String "DarkMonkey" for 
     * registering this Look And Feel with the UImanager.
     * @return String "DarkMonkey"
     */
    @Override
    public String getID() {
        return "DarkMonkey";
    }

    /**
     * This method override, getName() returns the String "DarkMonkey" for 
     * its Look and Feel Name. I don't know that this is important, but is
     * overridden anyway, for completion.
     * @return String "DarkMonkey"
     */
    @Override
    public String getName() {
        return "DarkMonkey";
    }

    /**
     * This method override, getDescription() returns the String 
     * "Look and Feel DarkMonkey - 2015, based on NimROD 2007" for 
     * instances of future programming that might use it as a tool tip or 
     * small descriptor in their Look and Feel modules.
     * @return String "Look and Feel DarkMonkey - 2016, based on NimROD 2007"
     */
    @Override
    public String getDescription() {
        return "Look and Feel DarkMonkey - 2016, based on NimROD 2007";
    }
    
       
    @Override
    protected void initClassDefaults( UIDefaults table) {
        super.initClassDefaults( table);
        /*
        for( Enumeration en = table.keys(); en.hasMoreElements(); ) {
            System.out.println( "[" + en.nextElement() + "]");
        }
        */
    }
    
    @Override
    protected void initComponentDefaults( UIDefaults table) {
        super.initComponentDefaults( table);
        
        table.put("Tree.collapsedIcon", DarkMonkeyIconFactory.getTreeCollapsedIcon());
        table.put("Tree.expandedIcon", DarkMonkeyIconFactory.getTreeExpandedIcon());
        // 
        /*
        for( Enumeration en = table.keys(); en.hasMoreElements(); ) {
            System.out.println( "[" + en.nextElement() + "]");
        }
        */
             
    }
    
    private NimRODTheme getBlueTheme() {
        NimRODTheme nt = new NimRODTheme(); //nbres:/org.jme3.netbeans.plaf.darkmonkey
        
        nt.setBlack(Color.decode("#E8EAE0"));
        nt.setWhite(Color.decode("#373737"));
        nt.setPrimary1(Color.decode("#1A28BD"));
        nt.setPrimary2(Color.decode("#233FB0"));
        nt.setPrimary3(Color.decode("#3AA5F2"));
        nt.setSecondary1(Color.decode("#303030"));
        nt.setSecondary2(Color.decode("#3A3A3A"));
        nt.setSecondary3(Color.decode("#515151"));
        nt.setFrameOpacity(180);
        nt.setMenuOpacity(219);
        nt.setFont(Font.decode("DejaVu Sans Condensed-PLAIN-12"));
        
        return nt;
    }
    
    /**
     * This is the Yellow Theme. It's the new default one, since Bananas = Yellow
     * @return 
     */
    private NimRODTheme getYellowTheme() {
        NimRODTheme nt = new NimRODTheme(); //nbres:/org.jme3.netbeans.plaf.darkmonkey
        
        nt.setBlack(Color.decode("#E8EAE0"));
        nt.setWhite(Color.decode("#262626"));
        nt.setPrimary1(Color.decode("#F3EF02"));
        nt.setPrimary2(Color.decode("#F3C802"));
        nt.setPrimary3(Color.decode("#FFB54D"));
        nt.setSecondary1(Color.decode("#303030"));
        nt.setSecondary2(Color.decode("#3A3A3A"));
        nt.setSecondary3(Color.decode("#515151"));
        nt.setFrameOpacity(180);
        nt.setMenuOpacity(219);
        nt.setFont(Font.decode("DejaVu Sans Condensed-PLAIN-12"));
        
        return nt;
    }
    
    /**
     * This is the Legacy Theme. It's the one that DarkMonkey had before alpha-4
     * @return 
     */
    private NimRODTheme getLegacyTheme() {
        NimRODTheme nt = new NimRODTheme(); //nbres:/org.jme3.netbeans.plaf.darkmonkey
        
        nt.setBlack(Color.decode("#E8EAE0"));
        nt.setWhite(Color.decode("#262626"));
        nt.setPrimary1(Color.decode("#77411D"));
        nt.setPrimary2(Color.decode("#9E5F28"));
        nt.setPrimary3(Color.decode("#948519"));
        nt.setSecondary1(Color.decode("#303030"));
        nt.setSecondary2(Color.decode("#3A3A3A"));
        nt.setSecondary3(Color.decode("#515151"));
        nt.setFrameOpacity(180);
        nt.setMenuOpacity(219);
        nt.setFont(Font.decode("DejaVu Sans Condensed-PLAIN-12"));
        
        return nt;
    }
    
    /**
     * Return the Debug Theme (It will have R, G and B so you know what Primary1 means etc)
     * @return 
     */
    private NimRODTheme getDebugTheme() {
        NimRODTheme nt = new NimRODTheme(); //nbres:/org.jme3.netbeans.plaf.darkmonkey
        
        nt.setBlack(Color.decode("#000000")); // Font Foreground
        nt.setWhite(Color.decode("#FFFFFF")); // Font Background
        nt.setPrimary1(Color.decode("#FF0000")); // Surrounds Bars and Shortcuts
        nt.setPrimary2(Color.decode("#00FF00")); // mainly used for bars 
        nt.setPrimary3(Color.decode("#0000FF")); // e.g. for open tabs (Application)
        nt.setSecondary1(Color.decode("#00FF00")); // Selected Things
        nt.setSecondary2(Color.decode("#FF0000")); // Selected inactive Things
        nt.setSecondary3(Color.decode("#0000FF")); // Unselected Frames
        nt.setFrameOpacity(180);
        nt.setMenuOpacity(219);
        nt.setFont(Font.decode("DejaVu Sans Condensed-PLAIN-12"));
        
        return nt;
    }
}

package org.openoffice.ezodfmenu.comp;

import com.sun.star.uno.UnoRuntime;
import com.sun.star.uno.XComponentContext;
import com.sun.star.lib.uno.helper.Factory;
import com.sun.star.lang.XSingleComponentFactory;
import com.sun.star.registry.XRegistryKey;
import com.sun.star.lib.uno.helper.WeakBase;


public final class EZODFMenuImpl extends WeakBase
   implements com.sun.star.lang.XServiceInfo,
              org.openoffice.ezodfmenu.XeZODFMenu
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = EZODFMenuImpl.class.getName();
    private static final String[] m_serviceNames = {
        "org.openoffice.ezodfmenu.eZODFMenu" };


    public EZODFMenuImpl( XComponentContext context )
    {
        m_xContext = context;
    };

    public static XSingleComponentFactory __getComponentFactory(String sImplementationName ) {
        XSingleComponentFactory xFactory = null;

        if ( sImplementationName.equals( m_implementationName ) )
            xFactory = Factory.createComponentFactory(EZODFMenuImpl.class, m_serviceNames);
        return xFactory;
    }

    public static boolean __writeRegistryServiceInfo(XRegistryKey xRegistryKey ) {
        return Factory.writeRegistryServiceInfo(m_implementationName,
                                                m_serviceNames,
                                                xRegistryKey);
    }

    // com.sun.star.lang.XServiceInfo:
    public String getImplementationName() {
         return m_implementationName;
    }

    public boolean supportsService( String sService ) {
        int len = m_serviceNames.length;

        for( int i=0; i < len; i++) {
            if (sService.equals(m_serviceNames[i]))
                return true;
        }
        return false;
    }

    public String[] getSupportedServiceNames() {
        return m_serviceNames;
    }

    // org.openoffice.ezodfmenu.XeZODFMenu:
    public void save()
    {
        // TODO !!!
        // Insert your implementation here.
    }

    public void saveAs()
    {
        // TODO !!!
        // Insert your implementation here.
    }

    public void open()
    {
    	openController = new eZODFMenuOpenController();
        // TODO !!!
        // Insert your implementation here.
    }

}

package com.selectica.Demka.eclm.definitions.CGenBO.CGenDetails.scripts;

import com.selectica.rcfscripts.AbstractDataWriteScript;

/**
 * Created by vshilkin on 21/01/2015.
 */
public class BundleDefPathForCreateScript extends AbstractDataWriteScript<String> {
    /*
            <![CDATA[
            result = "BundleDef:/DCPBO/";
            ]]>
     */
    @Override
    public String process() throws Exception {
        return "BundleDef:/DCPBO/";
    }
}

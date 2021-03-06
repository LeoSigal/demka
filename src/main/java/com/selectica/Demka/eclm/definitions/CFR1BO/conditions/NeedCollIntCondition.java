package com.selectica.Demka.eclm.definitions.CFR1BO.conditions;

import com.selectica.Demka.stubs.CFR1Details;
import com.selectica.rcfscripts.AbstractBOReadScript;

/**
 * Created by vshilkin on 08/01/2015.
 */
public class NeedCollIntCondition extends AbstractBOReadScript<Boolean> {
    /*
                <![CDATA[
				result  = thisBundle.getInfoValueObject("intCollReq") == 'yes'
			]]>
     */
    @Override
    public Boolean process() throws Exception {
        CFR1Details info = getHelper().getInfoComponentStub();
        return info.getIntCollReq() != null && info.getIntCollReq().equals("yes");
    }
}


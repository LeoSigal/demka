package com.selectica.Demka.eclm.definitions.CGenBO.actions;

import com.selectica.Demka.eclm.definitions.ContractStatus;
import com.selectica.Demka.stubs.CGenDetails;
import com.selectica.rcfscripts.AbstractBOWriteScript;

/**
 * Created by vshilkin on 08/01/2015.
 */
public class SetStatusActiveAction extends AbstractBOWriteScript<Boolean> {
    /*
                thisComponent.setValue("CGenData/ReqCGenDetails/contractStatus","Executed");
                thisComponent.save();
     */
    @Override
    public Boolean process() throws Exception {
        CGenDetails info = getHelper().getInfoComponentStub();
        info.setContractStatus(ContractStatus.EXECUTED.getStatus());
        return getHelper().saveComponent(info);
    }
}

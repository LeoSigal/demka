package com.selectica.Demka.eclm.definitions.CSalesBO.actions;

import com.selectica.Demka.eclm.definitions.ContractStatus;
import com.selectica.Demka.stubs.CSDetails;
import com.selectica.rcfscripts.AbstractBOWriteScript;

/**
 * Created by vshilkin on 08/01/2015.
 */
public class SetStatusActiveAction extends AbstractBOWriteScript<Boolean> {
    /*
       thisComponent.setValue("CSalesData/ReqCSalesDetails/contractStatus", "Executed");
       thisComponent.save();
     */

    @Override
    public Boolean process() throws Exception {
        CSDetails info = getHelper().getInfoComponentStub();
        info.setContractStatus(ContractStatus.EXECUTED.getStatus());
        return getHelper().saveComponent(info);
    }
}

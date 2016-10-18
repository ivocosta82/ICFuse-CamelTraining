package com.estafet.training.redhat.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ivo on 06/10/2016.
 */
public class IbanWrapper implements Serializable {
    private List<String> ibans;

    public IbanWrapper(){

    }

    public List<String> getIbans() {
        return ibans;
    }

    public void setIbans(List<String> ibans) {
        this.ibans = ibans;
    }
}

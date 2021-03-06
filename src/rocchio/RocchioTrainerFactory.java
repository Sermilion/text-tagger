package rocchio;

import base.CentroidTrainer;
import base.TrainerAbstractFactory;
import utility.Delegate;

/**
 * Created by Sermilion on 04/01/2017.
 */
public class RocchioTrainerFactory implements TrainerAbstractFactory {

    private String lang;
    private Delegate delegate;

    public RocchioTrainerFactory(String lang, Delegate delegate){
        this.lang = lang;
        this.delegate = delegate;
    }

    public RocchioTrainerFactory(String lang){
        this.lang = lang;
    }

    @Override
    public CentroidTrainer getTrainer() {
        return new RocchioTrainer(lang, delegate);
    }

}

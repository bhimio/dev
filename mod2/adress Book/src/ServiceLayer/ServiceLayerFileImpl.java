package ServiceLayer;

import interfaces.Dao;
import interfaces.ServiceLayer;

public class ServiceLayerFileImpl implements ServiceLayer {
    Dao dao;

    public ServiceLayerFileImpl(Dao dao) {
        this.dao = dao;
    }
}

package services;

import java.util.List;

public class Converter {
    public List<Party> parties;
    public Boolean DLSuspended;
}

class Party {
    public Driver driver;
}
class Driver {
    public List<License> licenses;
    public Boolean offenseIndicator;
}

class License {
    public Boolean licenseSuspended;
}

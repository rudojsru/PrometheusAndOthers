package klinika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {


    Map <Owner,List> OwnerAndPets = new HashMap<>();

    public Map<Owner, List> getOwnerAndPets() {
        return OwnerAndPets;
    }

    private List<Owner> owners = new ArrayList();
  private List<Pet> pets =new ArrayList<>();



}

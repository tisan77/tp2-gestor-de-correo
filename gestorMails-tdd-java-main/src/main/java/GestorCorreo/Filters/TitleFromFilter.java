package GestorCorreo.Filters;

import java.util.ArrayList;

import GestorCorreo.*;

public class TitleFromFilter extends Filter {
    public TitleFromFilter(){
        super.setName("Filtro de Asunto y Remitente");
}

@Override
public ArrayList<Mail> filter(String toSearchTitle, String toSearchAnother, Box box){
     TitleFilter titleFilter = new TitleFilter();
     FromFilter fromFilter = new FromFilter();

     ArrayList<Mail> titleResults = titleFilter.filter(toSearchTitle, box);
     ArrayList<Mail> fromResults = fromFilter.filter(toSearchAnother, box);

     ArrayList<Mail> result = new ArrayList<>(titleResults);
     result.retainAll(fromResults);

     return result;
}

}

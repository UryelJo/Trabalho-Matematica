package faculdade.matematica.trabalhobrito.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SomaDTO {
    private List<Double> resultado_UV = new ArrayList<>(3);
    private List<Double> resultado_UW = new ArrayList<>(3);
    private List<Double> resultado_VW = new ArrayList<>(3);

}

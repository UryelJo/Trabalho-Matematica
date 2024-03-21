package faculdade.matematica.trabalhobrito.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MultiplicacaoConstanteDTO {
    private List<Double> resultado_KU = new ArrayList<>(3);
    private List<Double> resultado_KV = new ArrayList<>(3);
    private List<Double> resultado_KW = new ArrayList<>(3);
}

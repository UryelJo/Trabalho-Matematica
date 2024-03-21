package faculdade.matematica.trabalhobrito.resource;

import faculdade.matematica.trabalhobrito.dto.*;
import faculdade.matematica.trabalhobrito.form.FormularioDeNumeros;
import faculdade.matematica.trabalhobrito.service.TrabalhoBritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trabalho-brito/implementacao")
public class TrabalhoBritoResource {

    private final TrabalhoBritoService trabalhoBritoService;

    @Autowired
    public TrabalhoBritoResource(TrabalhoBritoService trabalhoBritoService) {
        this.trabalhoBritoService = trabalhoBritoService;
    }


    @GetMapping("/soma")
    public ResponseEntity<SomaDTO> calcularSoma(@RequestBody FormularioDeNumeros formularioDeNumeros) {
        return this.trabalhoBritoService.calcularSoma(formularioDeNumeros);
    }

    @GetMapping("/subtracao")
    public ResponseEntity<SubtracaoDTO> calcularSubtracao(@RequestBody FormularioDeNumeros formularioDeNumeros) {
        return this.trabalhoBritoService.calcularSubtracao(formularioDeNumeros);
    }

    @GetMapping("/multiplicacao-por-constante/{constante}")
    public ResponseEntity<MultiplicacaoConstanteDTO> calcularMultiplicacaoPorConstante(@RequestBody FormularioDeNumeros formularioDeNumeros, @PathVariable Long constante) {
        return this.trabalhoBritoService.calcularMultiplicacaoPorConstante(formularioDeNumeros, constante);
    }

    @GetMapping("/modulo")
    public ResponseEntity<ModuloDTO> calcularModulo(@RequestBody FormularioDeNumeros formularioDeNumeros) {
        return this.trabalhoBritoService.calcularModulo(formularioDeNumeros);
    }

    @GetMapping("/produto-escalar")
    public ResponseEntity<ProdutoEscalarDTO> calcularProdutoEscalar(@RequestBody FormularioDeNumeros formularioDeNumeros) {
        return this.trabalhoBritoService.calcularProdutoEscalar(formularioDeNumeros);
    }

    @GetMapping("/angulo-vetores")
    public ResponseEntity<AnguloEntreVetoresDTO> calcularAnguloVetores(@RequestBody FormularioDeNumeros formularioDeNumeros) {
        return this.trabalhoBritoService.calcularAnguloVetores(formularioDeNumeros);
    }
}

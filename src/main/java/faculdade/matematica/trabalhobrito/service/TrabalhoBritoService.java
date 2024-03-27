package faculdade.matematica.trabalhobrito.service;

import faculdade.matematica.trabalhobrito.dto.*;
import faculdade.matematica.trabalhobrito.form.FormularioDeNumeros;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrabalhoBritoService {

    public ResponseEntity<SomaDTO> calcularSoma(FormularioDeNumeros formularioDeNumeros) {
        List<Double> soma = new ArrayList<>(3);
        SomaDTO somaDTO = new SomaDTO();
        soma.add((double) (formularioDeNumeros.getX1() + formularioDeNumeros.getX2()));
        soma.add((double) (formularioDeNumeros.getY1() + formularioDeNumeros.getY2()));
        soma.add((double) (formularioDeNumeros.getZ1() + formularioDeNumeros.getZ2()));
        somaDTO.setResultado_UV(soma);
        soma.clear();
        soma.add((double) (formularioDeNumeros.getX1() + formularioDeNumeros.getX3()));
        soma.add((double) (formularioDeNumeros.getY1() + formularioDeNumeros.getY3()));
        soma.add((double) (formularioDeNumeros.getZ1() + formularioDeNumeros.getZ3()));
        somaDTO.setResultado_UW(soma);
        soma.clear();
        soma.add((double) (formularioDeNumeros.getX2() + formularioDeNumeros.getX3()));
        soma.add((double) (formularioDeNumeros.getY2() + formularioDeNumeros.getY3()));
        soma.add((double) (formularioDeNumeros.getZ2() + formularioDeNumeros.getZ3()));
        somaDTO.setResultado_VW(soma);
        return ResponseEntity.ok().body(somaDTO);
    }

    public ResponseEntity<SubtracaoDTO> calcularSubtracao(FormularioDeNumeros formularioDeNumeros) {
        List<Double> subtracao = new ArrayList<>(3);
        SubtracaoDTO subtracaoDTO = new SubtracaoDTO();
        subtracao.add((double) (formularioDeNumeros.getX1() - formularioDeNumeros.getX2()));
        subtracao.add((double) (formularioDeNumeros.getY1() - formularioDeNumeros.getY2()));
        subtracao.add((double) (formularioDeNumeros.getZ1() - formularioDeNumeros.getZ2()));
        subtracaoDTO.setResultado_UV(subtracao);
        subtracao.clear();
        subtracao.add((double) (formularioDeNumeros.getX1() - formularioDeNumeros.getX3()));
        subtracao.add((double) (formularioDeNumeros.getY1() - formularioDeNumeros.getY3()));
        subtracao.add((double) (formularioDeNumeros.getZ1() - formularioDeNumeros.getZ3()));
        subtracaoDTO.setResultado_UW(subtracao);
        subtracao.clear();
        subtracao.add((double) (formularioDeNumeros.getX2() - formularioDeNumeros.getX3()));
        subtracao.add((double) (formularioDeNumeros.getY2() - formularioDeNumeros.getY3()));
        subtracao.add((double) (formularioDeNumeros.getZ2() - formularioDeNumeros.getZ3()));
        subtracaoDTO.setResultado_VW(subtracao);
        return ResponseEntity.ok().body(subtracaoDTO);
    }

    public ResponseEntity<MultiplicacaoConstanteDTO> calcularMultiplicacaoPorConstante(FormularioDeNumeros formularioDeNumeros, Long constante) {
        List<Double> multiplicacao = new ArrayList<>(3);
        MultiplicacaoConstanteDTO multiplicacaoConstanteDTO = new MultiplicacaoConstanteDTO();
        multiplicacao.add((double) (formularioDeNumeros.getX1() * constante));
        multiplicacao.add((double) (formularioDeNumeros.getY1() * constante));
        multiplicacao.add((double) (formularioDeNumeros.getZ1() * constante));
        multiplicacaoConstanteDTO.setResultado_KU(multiplicacao);
        multiplicacao.clear();
        multiplicacao.add((double) (formularioDeNumeros.getX2() * constante));
        multiplicacao.add((double) (formularioDeNumeros.getY2() * constante));
        multiplicacao.add((double) (formularioDeNumeros.getZ2() * constante));
        multiplicacaoConstanteDTO.setResultado_KV(multiplicacao);
        multiplicacao.clear();
        multiplicacao.add((double) (formularioDeNumeros.getX3() * constante));
        multiplicacao.add((double) (formularioDeNumeros.getY3() * constante));
        multiplicacao.add((double) (formularioDeNumeros.getZ3() * constante));
        multiplicacaoConstanteDTO.setResultado_KW(multiplicacao);
        return ResponseEntity.ok().body(multiplicacaoConstanteDTO);
    }

    public ResponseEntity<ModuloDTO> calcularModulo(FormularioDeNumeros formularioDeNumeros) {
        ModuloDTO moduloDTO = new ModuloDTO();
        moduloDTO.setResultado_M_U(Math.sqrt(Math.pow(formularioDeNumeros.getX1(), 2) + Math.pow(formularioDeNumeros.getY1(), 2) + Math.pow(formularioDeNumeros.getZ1(), 2)));
        moduloDTO.setResultado_M_V(Math.sqrt(Math.pow(formularioDeNumeros.getX2(), 2) + Math.pow(formularioDeNumeros.getY2(), 2) + Math.pow(formularioDeNumeros.getZ2(), 2)));
        moduloDTO.setResultado_M_W(Math.sqrt(Math.pow(formularioDeNumeros.getX3(), 2) + Math.pow(formularioDeNumeros.getY3(), 2) + Math.pow(formularioDeNumeros.getZ3(), 2)));
        return ResponseEntity.ok().body(moduloDTO);
    }

    public ResponseEntity<ProdutoEscalarDTO> calcularProdutoEscalar(FormularioDeNumeros formularioDeNumeros) {
        ProdutoEscalarDTO produtoEscalarDTO = new ProdutoEscalarDTO();
        produtoEscalarDTO.setResultado_UV((double) ((formularioDeNumeros.getX1() * formularioDeNumeros.getX2()) + (formularioDeNumeros.getY1() * formularioDeNumeros.getY2()) + (formularioDeNumeros.getZ1() * formularioDeNumeros.getZ2())));
        produtoEscalarDTO.setResultado_UW((double) ((formularioDeNumeros.getX1() * formularioDeNumeros.getX3()) + (formularioDeNumeros.getY1() * formularioDeNumeros.getY3()) + (formularioDeNumeros.getZ1() * formularioDeNumeros.getZ3())));
        produtoEscalarDTO.setResultado_VW((double) ((formularioDeNumeros.getX2() * formularioDeNumeros.getX3()) + (formularioDeNumeros.getY2() * formularioDeNumeros.getY3()) + (formularioDeNumeros.getZ2() * formularioDeNumeros.getZ3())));
        return ResponseEntity.ok().body(produtoEscalarDTO);
    }


    public ResponseEntity<AnguloEntreVetoresDTO> calcularAnguloVetores(FormularioDeNumeros formularioDeNumeros) {
        AnguloEntreVetoresDTO anguloEntreVetoresDTO = new AnguloEntreVetoresDTO();
        ModuloDTO moduloDTO = this.calcularModulo(formularioDeNumeros).getBody();
        assert moduloDTO != null;
        anguloEntreVetoresDTO.setResultado_UV(((double) ((formularioDeNumeros.getX1() * formularioDeNumeros.getX2()) + (formularioDeNumeros.getY1() * formularioDeNumeros.getY2()) + (formularioDeNumeros.getZ1() * formularioDeNumeros.getZ2()))) / (moduloDTO.getResultado_M_U() * moduloDTO.getResultado_M_V()));
        anguloEntreVetoresDTO.setResultado_UW(((double) ((formularioDeNumeros.getX1() * formularioDeNumeros.getX3()) + (formularioDeNumeros.getY1() * formularioDeNumeros.getY3()) + (formularioDeNumeros.getZ1() * formularioDeNumeros.getZ3()))) / (moduloDTO.getResultado_M_U() * moduloDTO.getResultado_M_W()));
        anguloEntreVetoresDTO.setResultado_VW(((double) ((formularioDeNumeros.getX2() * formularioDeNumeros.getX3()) + (formularioDeNumeros.getY2() * formularioDeNumeros.getY3()) + (formularioDeNumeros.getZ2() * formularioDeNumeros.getZ3()))) / (moduloDTO.getResultado_M_V() * moduloDTO.getResultado_M_W()));
        anguloEntreVetoresDTO.setResultado_UV(Math.acos(anguloEntreVetoresDTO.getResultado_UV()));
        anguloEntreVetoresDTO.setResultado_UW(Math.acos(anguloEntreVetoresDTO.getResultado_UW()));
        anguloEntreVetoresDTO.setResultado_VW(Math.acos(anguloEntreVetoresDTO.getResultado_VW()));
        anguloEntreVetoresDTO.setResultado_UV((anguloEntreVetoresDTO.getResultado_UV()*180)/Math.PI);
        anguloEntreVetoresDTO.setResultado_UW((anguloEntreVetoresDTO.getResultado_UW()*180)/Math.PI);
        anguloEntreVetoresDTO.setResultado_VW((anguloEntreVetoresDTO.getResultado_VW()*180)/Math.PI);
        return ResponseEntity.ok().body(anguloEntreVetoresDTO);
    }

    public ResponseEntity<ProdutoVetorialDTO> calcularProdutoVetorial(FormularioDeNumeros formularioDeNumeros) {
        ProdutoVetorialDTO produtoVetorialDTO = new ProdutoVetorialDTO();
        produtoVetorialDTO.setResultado_UV((double) ((formularioDeNumeros.getY1() * formularioDeNumeros.getZ2()) - (formularioDeNumeros.getY2() * formularioDeNumeros.getZ1())) + ((formularioDeNumeros.getZ1() * formularioDeNumeros.getX2()) - (formularioDeNumeros.getZ2() * formularioDeNumeros.getX1())) + ((formularioDeNumeros.getX1() * formularioDeNumeros.getY2()) - (formularioDeNumeros.getX2() * formularioDeNumeros.getY1())));
        produtoVetorialDTO.setResultado_VW((double) ((formularioDeNumeros.getY2() * formularioDeNumeros.getZ3()) - (formularioDeNumeros.getY3() * formularioDeNumeros.getZ2())) + ((formularioDeNumeros.getZ2() * formularioDeNumeros.getX3()) - (formularioDeNumeros.getZ3() * formularioDeNumeros.getX2())) + ((formularioDeNumeros.getX2() * formularioDeNumeros.getY3()) - (formularioDeNumeros.getX3() * formularioDeNumeros.getY2())));
        produtoVetorialDTO.setResultado_UW((double) ((formularioDeNumeros.getY1() * formularioDeNumeros.getZ3()) - (formularioDeNumeros.getY3() * formularioDeNumeros.getZ1())) + ((formularioDeNumeros.getZ1() * formularioDeNumeros.getX3()) - (formularioDeNumeros.getZ3() * formularioDeNumeros.getX1())) + ((formularioDeNumeros.getX1() * formularioDeNumeros.getY3()) - (formularioDeNumeros.getX3() * formularioDeNumeros.getY1())));
        return ResponseEntity.ok().body(produtoVetorialDTO);
    }


    public ResponseEntity<ProdutoMistoDTO> calcularProdutoMisto(FormularioDeNumeros formularioDeNumeros) {
        ProdutoMistoDTO produtoMistoDTO = new ProdutoMistoDTO();
        produtoMistoDTO.setResultadoProdutoMisto((double) ((formularioDeNumeros.getX1() * formularioDeNumeros.getY2() * formularioDeNumeros.getZ3()) + (formularioDeNumeros.getY1() * formularioDeNumeros.getZ2() * formularioDeNumeros.getX3()) + (formularioDeNumeros.getZ1() * formularioDeNumeros.getX2() * formularioDeNumeros.getY3())) - ((formularioDeNumeros.getZ1() * formularioDeNumeros.getY2() * formularioDeNumeros.getX3()) + (formularioDeNumeros.getY1() * formularioDeNumeros.getX2() * formularioDeNumeros.getZ3()) + (formularioDeNumeros.getX1() * formularioDeNumeros.getZ2() * formularioDeNumeros.getY3())));
        return ResponseEntity.ok().body(produtoMistoDTO);
    }
}

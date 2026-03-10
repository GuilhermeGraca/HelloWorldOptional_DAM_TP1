# Assignment 1 — Building a System Info App (Ex 5.3)
Course: Desenvolvimento de Aplicações Móveis
Student(s): 51827
Date: 08/03/2026
Repository URL: https://github.com/GuilhermeGraca/HelloWorldOptional_DAM_TP1/
---

## 1. Introduction
O objetivo deste exercício foi desenvolver uma aplicação Android capaz de extrair e exibir informações detalhadas sobre o hardware e o sistema operativo do dispositivo. O foco principal foi a utilização da API `android.os.Build` para aceder a metadados do sistema e a sua formatação numa interface de utilizador legível.

## 2. System Overview
A aplicação consiste numa interface de ecrã único que apresenta uma lista de propriedades técnicas do dispositivo (como fabricante, modelo, versão do SDK, etc.). O principal caso de uso é permitir que o utilizador ou um desenvolvedor consulte rapidamente as especificações do "build" atual do sistema de forma centralizada.

## 3. Architecture and Design
O projeto segue a arquitetura padrão de uma aplicação Android nativa:
- **UI Layer:** Definida em XML (`activity_main.xml`), utilizando um `TextView` dentro de um `ConstraintLayout`.
- **Logic Layer:** A `MainActivity.kt` é responsável por intercetar o ciclo de vida da aplicação, recolher os dados do sistema e atualizar a UI.
- **Resources:** Utilização de `strings.xml` para definir um template formatado, o que promove a separação entre lógica e apresentação. Foi também esta a forma utilizada em exercicios anteriores

## 4. Implementation
A implementação baseia-se no uso da classe `android.os.Build`. 
Principais detalhes técnicos:
- **Recuperação de Dados:** Utilização de constantes como `Build.MANUFACTURER`, `Build.MODEL`, `Build.VERSION.SDK_INT`, entre outras.
- **Formatação:** Foi utilizado o método `getString()` com múltiplos argumentos para preencher um marcador de posição no ficheiro de strings, o que garante uma apresentação organizada.

Exemplo de código relevante:
val info = getString(
            R.string.device_info_template,
            Build.MANUFACTURER,
            Build.MODEL,
            Build.BRAND,
            Build.TYPE,
            Build.USER,
            Build.VERSION.BASE_OS,
            Build.VERSION.INCREMENTAL,
            Build.VERSION.SDK_INT,
            Build.VERSION.RELEASE,
            Build.DISPLAY
        )

## 5. Testing and Validation
- **Ambiente:**  Testado no emulador Pixel 9 Pro AVD (Android 7.0 - API 24).
- Verificação de que as propriadades do emulador aparecem corretamente no display
  
## 6. Usage Instructions
1. Clonar o repositório.
2. Abrir o projeto no **Android Studio (Ladybug ou superior)**.
3. Sincronizar o projeto com o Gradle.
4. Executar a aplicação num dispositivo físico ou num emulador Android (API 24 ou superior recomendada).

# Development Process
## 12. Version Control and Commit History
Apenas foi feito um commit and push após o exercicio estar finalizado. Posteriormente foi feito o commit do ficheiro README.md

## 13. Difficulties and Lessons Learned
- Aprendi a utilizar a classe `Build` para introspeção do sistema Android.

## 14. Future Improvements
- Implementar a capacidade de partilhar/copiar as informações do sistema para a área de transferência.
- Adicionar uma barra de pesquisa ou filtragem para propriedades específicas.
- Melhorar a UIpara uma listagem mais dinâmica.

---
## 15. AI Usage Disclosure (Mandatory)
- **Ferramentas Utilizadas:** Autocomplete da IDE e GEMINI 3.
- **Uso:**
-   A funcionalidade de autocomplete foi utilizada para acelerar a escrita das constantes da classe `Build` e a estrutura repetitiva da função `getString`.
-   O Gemini 3 foi utilizado para apoio na redação do ficheiro README.
- **Responsabilidade:** Confirmo que revi todo o código gerado/sugerido e sou responsável pelo conteúdo final deste relatório e da implementação.

# template2Html

Uma ferramenta de templating que permite gerar ficheiros HTML complexos sem necessidade de conhecer toda a sintaxe HTML.
Basta saber o básico — como criar títulos e parágrafos — e usar os scripts para adicionar componentes mais avançados como imagens, vídeos e galerias.
Exemplo input.json: 

Como funciona
A ferramenta recebe três ficheiros:

template.html — o ficheiro HTML com scripts nos sítios onde quer conteúdo dinâmico
input.json — os dados que serão usados para preencher o template
output.html — o ficheiro HTML final gerado

Os scripts são delimitados por {{ }} e são substituídos pelo HTML correspondente

Sintaxe dos Scripts:

Variáveis:
Podem ser definidas diretamente no template e usadas nos shortcodes:

{{ largura = 400 }}
{{ metade = largura / 2 }}

Acesso ao JSON:
Para substituir um valor diretamente do JSON:

{{ nome }}

Imagem:

{{ img src largura altura }}

Que gera:

<figure>
    <img src="foto_principal.jpg" width="400" height="300" loading="lazy">
</figure>

Vídeo / GIF:

{{ video src largura altura }}

tanto para mp4, como para gif

Galeria:

{{ gallery fotos }}

Que gera um slide automatico com transição de 3 em 3sg

Condicional:

{{ if ativo }}
{{ badge "Ativo" "green" }}
{{ else }}
{{ badge "Inativo" "red" }}
{{ end }}

Arquitetura:
A ferramenta é composta por:

JsonGrammar — gramática ANTLR4 para fazer o parsing do ficheiro JSON
ScriptGrammar — gramática ANTLR4 para fazer o parsing dos scripts {{ }}
JsonAST — classes que representam os valores JSON (JObject, JArray, JString, JNumber, JBoolean, JNull)
ScriptAST — classes que representam as instruções dos scripts (Assign, If, Else, End, Shortcode, Access)
Interpreter — processa o template, executa os scripts e gera o HTML final

Como Instalar e Correr:
Requisitos:

Java 17 ou superior
Gradle

Gerar o JAR:

./gradlew jar

Correr:

java -jar build/libs/Projeto-1.0-SNAPSHOT.jar template.html input.json output.html



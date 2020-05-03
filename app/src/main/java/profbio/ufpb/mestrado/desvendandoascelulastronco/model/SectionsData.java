package profbio.ufpb.mestrado.desvendandoascelulastronco.model;

import androidx.core.text.HtmlCompat;

public class SectionsData {

    private static Section[] sections = new Section[] {
            new Section("O QUE SÃO CÉLULAS-TRONCO?",
                    HtmlCompat.fromHtml("O organismo humano é constituído por centenas de tipos celulares diferentes, " +
                            "importantes para nossa saúde. Estas células possuem a capacidade de renovação celular mantendo o bom " +
                            "funcionamento do nosso organismo. Sabendo que há cerca de três trilhões de células que possuímos se " +
                            "originaram a partir de uma única célula, denominada zigoto, e que por sucessivas divisões celulares " +
                            "(Mitoses) formaram os diferentes grupos celulares componentes do nosso corpo. Mas como se originaram" +
                            " a vasta variabilidade celular existente em um ser multicelular? A resposta é a partir das células-tronco (CT)." +
                            "<p>As CT possuem a função de produzir todos os tipos celulares existentes no corpo humano. Quando CT dividem-se podem " +
                            "ocorrer a produção de células idênticas a elas ou originar diversos outros tipos celulares. Como exemplo, a diferenciação " +
                            "das CT da epiderme que produzem o pigmento melanina.</p>" +
                            "<p>Elas são responsáveis por originar diversos tipos celulares existentes no organismo humano, tudo isso dependendo da " +
                            "sua capacidade de diferenciação: Unipotentes, Oligopotentes, Pluripotentes, Multipotentes, Totipotentes. As CT unipotentes " +
                            "são aquelas que só possuem a capacidade de diferenciação em um único tipo celular (por exemplo, células que fazem parte do tecido " +
                            "sanguíneo). As Oligotentes são aquelas CT que possuem a capacidade de diferenciação em (Oligo=pouco) poucos tecidos (por exemplo, " +
                            "células linfoides e mielóides). CT pluripotentes, são células que podem dar origem a qualquer tipo de célula do feto em formação " +
                            "ou adulta, exceto placenta e anexos embrionários, e podem ser encontradas em vários tecidos, incluindo sangue do cordão umbilical. " +
                            "Outras células-tronco adultas (CTA) são multipotentes, o que significa que são restritas nos tipos de células em que podem se tornar" +
                            " e geralmente são referidas por sua origem tecidual (como célula-tronco mesenquimal, célula-tronco derivada de tecido adiposo, " +
                            "célula-tronco endotelial, etc.). Por fim, as CT totipotentes, as quais geram tecidos extraembrionários originando organismos completos. " +
                            "Elas podem se diferenciar em todos os tecidos do corpo humano. Um exemplo é o zigoto.</p>" +
                            "<p>Atualmente, muitas pesquisas com células-tronco adultas se concentram em investigar sua capacidade de divisão ou de auto renovação " +
                            "indefinidamente e seu potencial de diferenciação. Estudos com camundongos, demonstraram que CT pluripotentes podem ser geradas diretamente " +
                            "de culturas de fibroblastos adultos.</p>" +
                            "<p>Uma vez que, naturalmente, as CT, através da sua capacidade de divisão, possuem a função de repor células doentes ou envelhecidas, são utilizadas " +
                            "em terapias para algumas doenças, tais como: doenças genéticas, cânceres e distúrbios relacionados ao sistema imunológico e ao sangue; diabetes juvenil, " +
                            "doença de Parkinson, cegueira e lesões na medula espinhal, além de trazerem a promessa de tratar os principais males que as pessoas enfrentam incluindo, " +
                            "esclerose múltipla, derrames cerebrais, Doença de Huntington, lesões de medula espinal e muitos mais.</p>" +
                            "<p>A terapia consiste em aplicar as CT no paciente (células tronco ou células diferenciadas obtidas de células tronco), e fazer uso da habilidade natural da " +
                            "célula tronco de se dividir e restaurar o tecido/órgão lesionado, na tentativa de recuperar a saúde do paciente. Tomamos por exemplo uma pessoa que sofreu um " +
                            "ataque cardíaco, sendo diagnosticado um infarto do miocárdio, as CT ao serem injetadas no corpo do paciente, poderá recuperar o tecido lesado a partir do potencial " +
                            "de diferenciação que essas células possuem.</p>" +
                            "<p>O problema maior, em relação ao uso de tais células, está justamente na liberação para sua utilização, esbarrando em embates ideológicos por parte da ciência e religião, " +
                            "principalmente por não chegarem a uma conclusão do momento exato em que a vida se inicia.</p>" +
                            "As CT’s podem ser agrupadas em três categorias: Células-tronco embrionárias (CTE), Células-tronco adultas (CTA) e Células-tronco induzidas (IPS).", HtmlCompat.FROM_HTML_MODE_LEGACY)),
            new Section("CÉLULAS-TRONCO EMBRIONÁRIAS (CTE)",
                    HtmlCompat.fromHtml("Verifica-se, algumas vezes, certa confusão na compreensão do conceito de célula-tronco embrionária (CTE). Para compreensão deste grupo celular, é extremamente " +
                            "necessário demonstrarmos o estágio de desenvolvimento em que ela ocorre. As CTE, denominadas assim, por serem células derivadas da massa celular interna de um blastocisto, um estágio inicial " +
                            "de pré-implantação no útero. Os embriões humanos atingem a fase de blastocisto por volta de 4-5 dias após a fertilização, sendo constituídas em média de 50-150 células. O trabalho para utilizar " +
                            "este tipo celular resulta em isolar o embrioblasto ou a massa celular interior acarretando na destruição do blastocisto, o que levanta questões éticas, como: “os embriões na fase de pré-implantação " +
                            "devem ou não ter o mesmo <i>status</i> moral ou legal que os embriões no estágio de desenvolvimento pós-implantação do blastocisto?”" +
                            "<h5><i>PROPRIEDADES</i></h5>" +
                            "As CTE, derivadas dos embriões de mamíferos precoces do estágio de blastocisto, distinguem-se por sua capacidade de se propagar. As propriedades das CTE incluem o cariótipo normal, " +
                            "a manutenção da atividade da telomerase elevada e o potencial proliferativo notável a longo prazo, sendo assim, conhecidas como células pluripotentes ou totipotentes. As CTE humanas medem aproximadamente 14µm." +
                            "<h5><i>PORQUE SÃO PLURIPOTENTES?</i></h5>" +
                            " As CTE da massa celular interna são pluripotentes ou totipotentes, ou seja, possuem a capacidade de diferenciação para gerar ectoderme primitiva, que finalmente se diferencia durante a gastrulação " +
                            "em todas as derivações das três camadas germinativas primárias: ectoderme, endoderme e mesoderme. Estes incluem cada um dos mais de 220 tipos de células no corpo adulto. A pluripotência distingue células-tronco embrionárias " +
                            "de células-tronco de adultos, enquanto as células-tronco embrionárias podem gerar todos os tipos de células no corpo, as células-tronco adultas são multipotentes e podem produzir apenas um número limitado de tipos de células. " +
                            "Se o potencial de diferenciação pluripotente das células-tronco embrionárias pudesse ser aproveitado <i>in vitro</i>, poderia ser um meio de derivar virtualmente os tipos de células ou tecidos. Isso proporcionaria uma nova " +
                            "abordagem radical de tratamento para uma ampla variedade de condições em que a idade, a doença ou o trauma levaram a danos ou disfunções nos tecidos." +
                            "<h5><i>COMO OCORRE A SUA PROPAGAÇÃO?</i></h5>" +
                            "Em condições definidas, as CTE são capazes de se propagarem indefinidamente de forma indiferenciada, presumivelmente através da formação de células precursoras, para quase todos os fenótipos celulares maduros. " +
                            "Isso permite que as CTE sejam empregadas como ferramentas úteis tanto para a pesquisa quanto para a medicina regenerativa, porque elas podem produzir números ilimitados de si mesmas para pesquisas contínuas ou uso clínico." +
                            "<h5><i>QUAIS AS UTILIDADES?</i></h5>" +
                            "Devido à sua plasticidade e capacidade potencialmente ilimitada de auto renovação, as terapias com CTE foram propostas para a medicina regenerativa e a substituição de tecidos após lesão ou doença. Doenças que " +
                            "poderiam potencialmente ser tratadas por células-tronco pluripotentes incluem uma série de doenças genéticas, cânceres e distúrbios relacionados ao sistema imunológico e ao sangue; diabetes juvenil, doença de Parkinson, cegueira e lesões na " +
                            "medula espinhal. Admite as preocupações éticas da terapia com células-tronco. As CTE dão esperanças de que será possível, em um futuro próximo, suprir a necessidade reposicional de tecidos, tornando as células imunocompatíveis com o receptor. " +
                            "Outras utilizações potenciais de CTE incluem a investigação do desenvolvimento inicial de humanos, estudo de doenças genéticas e sistemas in vitro para testes toxicológicos." +
                            "<p>O tema CT vem apresentando vários novos estudos que começaram a explorar esta questão. Isso foi feito manipulando geneticamente as células ou, mais recentemente, derivando linhas celulares doentes identificadas pelo " +
                            "diagnóstico genético pré-natal (DPG). Essa abordagem pode se tornar inestimável e importantíssima no estudo de distúrbios como a Síndrome do X frágil, fibrose cística, Síndrome de Rett, Autismo, entre outras.</p>" +
                            "Na busca em comprovar a eficácia de tal grupo celular, existem diversos estudos espalhados pelo planetasendo desenvolvidos em diferentes países. A utilização das CT vem facilitando o entendimento de doenças como a Sindrome " +
                            "de Rett, inclusive com resultados de possíveis medicamentos que possam ser utilizados no diagnóstico e tratamento de doenças neurológicas.", HtmlCompat.FROM_HTML_MODE_LEGACY)),
            new Section("CÉLULAS-TRONCO ADULTAS (CTA)",
                    HtmlCompat.fromHtml("As células-tronco adultas (CTA) são células indiferenciadas, encontradas em todo nosso corpo após o desenvolvimento, multiplicam-se através de sucessivas mitoses com o intuito de repor as células que estão " +
                            "morrendo, assim como, regenerar os tecidos danificados. Também denominadas células-tronco somáticas, elas podem ser encontradas tanto em animais jovens como adultos e humanos, ao contrário das CTE. A ciência possui interesse nas CTA pelo grande potencial " +
                            "de se dividir ou se auto renovar indefinidamente, gerando todos os tipos de células do órgão de onde são originárias, com a potencialidade de regenerar todo o órgão a partir de algumas células. Ao contrário das CTE, o uso de CTA em investigação e terapêutica " +
                            "não é considerado controverso, uma vez que são derivadas de amostras de tecidos adultos em vez de embriões humanos designados para investigação científica. Eles têm sido estudados principalmente em seres humanos e organismos modelo, como ratos e camundongos." +
                            "<br><br>A história das CTA inicia-se após a segunda guerra mundial com a liberação das bombas atômicas nas cidades japonesas de Hiroshima e Nagasaki, no ano de 1945. Tais bombardeios foram capitaneados pelos EUA e causaram um grande número " +
                            "de mortes precoces, dizimando grande parte da população existente naquelas cidades. Iniciaram diversos estudos para justificar a potencialidade existentes nas bombas, descobrindo-se a função no organismo de um grupo de células tronco presentes na medula óssea." +
                            "<h5><i>PROPRIEDADES</i></h5>" +
                            "Uma célula-tronco adulta possui duas propriedades:" +
                            "<p><i>Auto-renovação</i> - habilidade de passar por numerosos ciclos de divisão celular (mitoses) enquanto ainda mantém seu estado indiferenciado." +
                            "</p><i>Multipotência ou potencial multidiferenciativo</i> - capacidade de gerar progênie de vários tipos distintos de células (por exemplo, células gliais e neurônios) em oposição à unipotência, que é o termo para células que são restritas a produzir um tipo de " +
                            "célula única. No entanto, alguns pesquisadores não consideram a multipotência essencial e acreditam que células-tronco auto-renováveis e unipotentes podem existir. Estas propriedades podem ser ilustradas com relativa facilidade <i>in vitro</i>, utilizando métodos como o " +
                            "ensaio clonogênico, em que a progenia de uma única célula é caracterizada. No entanto, sabe-se que as condições de cultura celular <i>in vitro</i> podem alterar o comportamento das células, provando que uma subpopulação particular de células, possui propriedades de células " +
                            "estaminais <i>in vivo</i> um desafio e existe um debate considerável se algumas populações de <i>células estaminais</i> propostas presentes no adulto, são de fato células-tronco. As células estaminais (latim <i>stamen, staminis</i> = tronco, ordem, filo, fio) denominadas dessa forma por " +
                            "possuírem a capacidade de auto-divisão formando diversos grupos celulares existentes em um organismo vivos a capacidade de diferenciarem-se em diversos grupos de células e tecidos específicos com funções especializadas." +
                            "<h5><i>LINHAGEM DAS CÉLULAS-TRONCO</i></h5>" +
                            "Para assegurar a auto renovação, as CT sofrem dois tipos de divisão celular: Simétrica e Assimétrica. A divisão simétrica dá origem a duas células-filhas idênticas, ambas dotadas de propriedades de células estaminais, enquanto a divisão assimétrica produz apenas uma " +
                            "célula estaminal e progenitora com potencial de auto renovação limitado. Os progenitores podem passar por vários ciclos de divisão celular antes de finalmente se diferenciar em uma célula madura. Acredita-se que a distinção molecular entre divisões simétricas e assimétricas esteja na segregação " +
                            "diferencial das proteínas da membrana celular (como os receptores) entre as células filhas." +
                            "<h5><i>PLASTICIDADE</i></h5>" +
                            "As descobertas nos últimos anos sugeriram que as CTA podem ter a capacidade de se diferenciar em tipos de células de diferentes camadas germinativas. Por exemplo, células-tronco neurais do cérebro; que são derivados do ectoderma, podem se diferenciar em ectoderme, mesoderme e " +
                            "endoderme. Este fenômeno é referido como transdiferenciação de CT ou plasticidade. Pode ser induzida pela modificação do meio de crescimento quando as CT são cultivadas <i>in vitro</i> ou transplantadas para um órgão do corpo diferente daquele do qual foram originalmente isoladas. Ainda não há consenso entre " +
                            "os biólogos sobre a prevalência e relevância fisiológica e terapêutica da plasticidade das células-tronco. Descobertas mais recentes sugerem que células-tronco pluripotentes podem residir em tecidos sanguíneos e adultos em um estado dormente. Estas células são referenciadas como células estaminais do tipo " +
                            "<i>Blastomere Like</i> e células estaminais embrionárias muito pequenas tipo VSEL (do inglês “VerySmallEmbryonic-Like” - Muito pequeno tipo embrionário), e exibem pluripotência <i>in vitro</i>." +
                            "<h5><i>TIPOS DE CÉLULAS-TRONCO ADULTAS (CTA)</i></h5>" +
                            "<b><i>Células Estaminais Hematopoiéticas - </i></b>As células estaminais hematopoiéticas são encontradas na medula óssea e no sangue do cordão umbilical e dão origem a todos os tipos de células sanguíneas. Segundo a literatura específica, pesquisas desenvolvidas após a segunda guerra mundial " +
                            "em relação as bombas de Hiroshima e Nagasaki apontaram que boa parte das mortes foram proporcionadas por insuficiência medular. Em estudos posteriores, com camundongos, verificou-se que estes ao receberem certo grau de radiações apresentavam morte com características semelhantes ao acontecido com a população das " +
                            "cidades japonesas. Nestes mesmos experimentos verificaram-se que quando ocorria a inoculação do elemento químico chumbo (Ch) protegendo o baço destas cobaias, a atividade sanguínea não era prejudicada. A partir de tais observações foram administradas dosagens de células da medula óssea, com resultados satisfatórios, " +
                            "chegando a conclusões que tais células detinham a capacidade de regenerar todo o sistema medular." +
                            "<p><b><i>Células-tronco mamárias - </i></b>As células-tronco mamárias fornecem a fonte de células para o crescimento da glândula mamária durante a puberdade e a gestação e desempenham um papel importante na carcinogênese da mama. Células-tronco mamárias foram " +
                            "isoladas de tecidos humanos e de camundongos, bem como de linhagens celulares derivadas da glândula mamária. Únicas células que podem dar origem tanto aos tipos de células luminais e mioepiteliais do galão (responsáveis pela secreção do leite), como mostraram ter a capacidade de regenerar " +
                            "o órgão inteiro em camundongos." +
                            "</p><p><b><i>Células-tronco intestinais - </i></b>As células-tronco intestinais se dividem continuamente ao longo da vida e usam um programa genético complexo para produzir as células que revestem a superfície dos intestinos delgado e grosso. As células-tronco intestinais " +
                            "residem perto da base do nicho de células-tronco, chamadas de criptas de Lieberkuhn. As células-tronco intestinais são provavelmente a fonte da maioria dos cânceres do intestino delgado e do cólon." +
                            "</p><p><b><i>Células-tronco mesenquimais - </i></b>As células-tronco mesenquimais (CTM) são de origem estromal e podem se diferenciar em uma variedade de tecidos. A CTM foi isolada da placenta, tecido adiposo, pulmão, medula óssea e sangue, geléia de Wharton do cordão " +
                            "umbilical e dentes (nicho perivascular da polpa dentária e ligamento periodontal). A CTM é atraente para a terapia clínica devido à sua capacidade de se diferenciar em vários tipos de células, como osteoblastos, condroblastos, adipócitos, células neuroectodérmicas e hepatócitos." +
                            "</p><p><b><i>Células-tronco endoteliais - </i></b>As células-tronco endoteliais são um dos três tipos de células-tronco multipotentes encontradas na medula óssea. Eles são um grupo raro e controverso (discutem-se muito sobre suas capacidades), com a capacidade de se diferenciar " +
                            "em células endoteliais que revestem os vasos sanguíneos." +
                            "</p><p><b><i>Células-tronco neurais - </i></b>A existência de células-tronco no cérebro adulto foi postulada após a descoberta de que o processo de neurogênese, o nascimento de novos neurônios, continua na vida adulta em ratos. A presença de células-tronco no cérebro de primatas maduros " +
                            "foi relatada pela primeira vez em 1967. Desde então, foi demonstrado que novos neurônios são gerados em camundongos adultos, pássaros canoros e primatas, incluindo humanos. Normalmente, a neurogênese adulta é restrita a duas áreas do cérebro - a zona subventricular, que reveste os ventrículos laterais e o giro " +
                            "denteado do hipocampo, contudo a presença de verdadeiras células-tronco auto-renováveis tem sido debatida. Sob certas circunstâncias, como após dano tecidual na isquemia, a neurogênese pode ser induzida nas outras regiões cerebrais, incluindo o neocórtex. Estes tipos de células-tronco são comumente cultivadas <i>in vitro</i> " +
                            "como as chamadas neuroesferas - agregados heterogêneos flutuantes de células, contendo uma grande proporção de células-tronco. Eles podem ser propagados por longos períodos de tempo e diferenciadas em células neuronais e gliais e, portanto, comportam-se como células-tronco. Além disso, as células derivadas da neuroesfera " +
                            "não se comportam como células-tronco quando transplantadas de volta ao cérebro. As células estaminais neuronais partilham muitas propriedades com células estaminais hematopoiéticas (CTH). Notavelmente, quando injetadas no sangue, as células derivadas da neuroesfera se diferenciam em vários tipos de células do sistema imunológico." +
                            "</p><p><b><i>Células-tronco adultas olfativas - </i></b>São encontradas no revestimento do nariz e estão envolvidas no sentido do olfato. Se eles recebem o ambiente químico correto, essas células têm a mesma capacidade que as células-tronco embrionárias de se desenvolverem em muitos tipos diferentes de células. " +
                            "As células-tronco olfativas possuem potencial para aplicações terapêuticas e, em contraste com as células-tronco neurais, podem ser colhidas com facilidade, sem causar danos ao paciente. Isso significa que eles podem ser facilmente obtidos de todos os indivíduos, incluindo pacientes mais velhos que podem estar mais necessitados de terapias com células-tronco." +
                            "</p><p><b><i>Células-tronco da crista neural - </i></b>Os folículos capilares contêm dois tipos de células-tronco, uma das quais parece representar um remanescente das células-tronco da crista neural embrionária. Células semelhantes foram encontradas no trato gastrointestinal, no nervo ciático, na via de saída cardíaca e nos gânglios " +
                            "espinhais e simpáticos. Essas células podem gerar neurônios, células de Schwann, miofibroblastos, condrócitos e melanócitos." +
                            "</p><p><b><i>Células testiculares - </i></b>Células-tronco multipotentes com uma equivalência reivindicada a células-tronco embrionárias foram derivadas de células progenitoras de espermatogônias encontradas nos testículos de camundongos de laboratório por cientistas na Alemanha e nos Estados Unidos e, um ano depois, usando " +
                            "células dos testículos de humanos. As células-tronco extraídas são conhecidas como células-tronco germinativas humanas adultas (CTGA). Células-tronco multipotentes também foram derivadas de células germinativas encontradas em testículos humanos." +
                            "</p>O potencial terapêutico das células adultas é o foco de muitas pesquisas científicas, devido à sua capacidade de serem colhidas do paciente. Em comum com as células-tronco embrionárias, as células-tronco adultas detêm a capacidade de se diferenciar em mais de um tipo celular, mas, diferentemente da primeira, elas geralmente são restritas a certos tipos ou linhagens celulares.", HtmlCompat.FROM_HTML_MODE_LEGACY)),
            new Section("CÉLULAS-TRONCO PLURIPOTENTES INDUZIDAS (IPS)",
                    HtmlCompat.fromHtml("Tipo de células-tronco que foram inicialmente produzidas em laboratório, no ano 2006, através do pesquisador japonês chamado ShyniaYamanaka. Em suas experiências, ele reprogramou células da cauda de um camundongo fazendo com que estas voltassem a se comportar como CTE. No ano seguinte, a pesquisa de da equipe de Shynia Yamanaka, em 2007, sua equipe de pesquisa conseguiu, a partir da pele, produzir as primeiras células-tronco reprogramadas. A partir desta descoberta importantíssima para ciência médica, desde então tem sido a principal fonte de células para reprogramação, sabendo-se hoje, que qualquer tecido do corpo possui a capacidade de ser reprogramado." +
                            "</p><p>O grupo de células que foram produzidas em laboratório a partir da reprogramação celular são chamadas de células-tronco de pluripotência induzida ou pela sigla iPS (do inglês induced pluripotent stem cells)." +
                            "</p><p>As iPS são derivadas de reprogramação celular, processo realizado em laboratório, onde células de organismos adultos são retiradas e induzidas a expressar fatores de transcrição, levando a este grupo celular a desdiferenciação celular e recuperando as características presente nas CTE, a pluripotência." +
                            "</p><p>No ano de 2006, foi apresentada ao mundo científico, a ovelha Dolly, primeira ovelha clonada no mundo, abrindo-se assim, caminho para a possibilidade de clonagem humana ao demonstrar, pela primeira vez, que era possível clonar um mamífero - isto é, produzir uma cópia geneticamente idêntica, a partir de um tipo de célula-tronco. Todo o processo que levou a concretização da clonagem foi possibilitado pela utilização das iPS, onde uma célula somática foi usada e reprogramada, retirando-se o seu material genético e colocando-o em um óvulo anucleado que posteriormente foi implantado no útero comportando-se como um óvulo recém fecundado pelo espermatozoide." +
                            "</p>Diante dos impasses éticos na utilização de células-tronco, a ciência e a medicina aposta e muito no potencial que este grupo celular pode nos trazer, principalmente por não esquentarem os embates da ciência e religião já que são produzidas a partir da reprogramação de células vivas e possuírem praticamente as mesmas propriedades das células tronco embrionárias, tendo a grande vantagem de não serem obtidas de embriões. No tocante a utilização terapêutica, a grande potencialidade que as iPS possuem, vislumbram uma utilização futura no combate e prevenção de doenças. Por conta de tal capacidade é esperado que as iPS revolucionem a medicina regenerativa num futuro próximo.", HtmlCompat.FROM_HTML_MODE_LEGACY)),
            new Section("LEGISLAÇÃO SOBRE O USO DE CÉLULAS-TRONCO (CT)",
                    HtmlCompat.fromHtml("LEI Nº 11.105, DE 24 DE MARÇO DE 2005. De acordo com o Art. 1º Esta Lei estabelece normas de segurança e mecanismos de fiscalização sobre a construção, o cultivo, a produção, a manipulação, o transporte, a transferência, a importação, a exportação, o armazenamento, a pesquisa, a comercialização, o consumo, a liberação no meio ambiente e o descarte de organismos geneticamente modificados – OGM e seus derivados, tendo como diretrizes o estímulo ao avanço científico na área de biossegurança e biotecnologia, a proteção à vida e à saúde humana, animal e vegetal, e a observância do princípio da precaução para a proteção do meio ambiente.  Que demonstra no Art. 5º É permitida, para fins de pesquisa e terapia, a utilização de células-tronco embrionárias obtidas de embriões humanos produzidos por fertilização in vitro e não utilizados no respectivo procedimento, atendidas as seguintes condições:" +
                            "</p><p>I - Sejam embriões inviáveis; ou<br><br>II - Sejam embriões congelados há 3 (três) anos ou mais, na data da publicação desta Lei, ou que, já congelados na data da publicação desta Lei, depois de completarem 3 (três) anos, contados a partir da data de congelamento." +
                            "</p><p>§ 1º Em qualquer caso, é necessário o consentimento dos genitores.<br><br>§ 2º Instituições de pesquisa e serviços de saúde que realizem pesquisa ou terapia com células-tronco embrionárias humanas deverão submeter seus projetos à apreciação e aprovação dos respectivos comitês de ética em pesquisa." +
                            "</p><p>§ 3º É vedada a comercialização do material biológico a que se refere este artigo e sua prática implica o crime tipificado no art. 15 da Lei nº 9.434, de 4 de fevereiro de 1997." +
                            "</p><p>A lei de Biossegurança, sancionada em 24 de março de 2005, representou um significativo avanço para o direito e para as ciências médicas em geral. O assunto foi amplamente debatido no Congresso Nacional e foi consensual que seria liberado, juntamente com o projeto de biossegurança, a pesquisa com células-tronco." +
                            "</p><p>A ciência tem muito que contribuir para o tratamento de doenças. Os estudos com células-tronco têm oferecido resultados interessantes sendo que estas pesquisas podem salvar muitas vidas ou, pelo menos, melhorar a qualidade de vida de algumas pessoas. Apesar do debate, até o presente momento, a questão não logrou profundidade, amplitude e riqueza que o tema em estudo requer." +
                            "</p>As células-tronco poderiam revolucionar a medicina, ao curar doenças fatais com tecidos e órgãos especialmente criados. Mas a ciência pode ceder à política o privilégio da decisão sobre quando essa esperança se realizará.", HtmlCompat.FROM_HTML_MODE_LEGACY)),
            new Section("DIFERENCIAÇÃO CELULAR",
                    HtmlCompat.fromHtml("Ainda é difícil de entender nos dias atuais como todos nós, formados aproximadamente por mais de três trilhões de células, já fomos uma única no momento da fecundação, o zigoto. E também imaginarmos que antes mesmo desse zigoto, em um estágio superior a 100 células e antes da chegada ao útero materno para se implantar, aconteceram as primeiras divisões e diferenciações celulares.   É um processo único e perfeito responsável pela estruturação do nosso corpo. Mas o que seria na verdade o processo de diferenciação celular?" +
                            "<br><br>A biologia denomina de diferenciação, o processo em que células se especializam para originarem as diversas células existentes nos organismos vivos, proporcionando a capacidade de desempenharem funções distintas.Trata-se de um processo biológico complexo e vital, uma vez que regula a expressão de um grande número de genes ligados a funções tecido-específicas e controla a proliferação celular. É um mecanismo de transformação celular, responsável por gerar uma grande diversidade de formas celulares com a capacidade de realizar diversas funções. Esta especialização acarreta não só alterações da função, mas também da estrutura das células. O processo de determinação de qual função uma célula exercerá quando adulta ainda é desconhecido, não sabendo ao certo de onde partem os comandos para sua especificidade, função e destino nos organismos vivos. Conhece-se somente que a determinação de funcionalidade acontece durante o desenvolvimento e crescimento do embrião na orientação para originar os diversos tecidos existentes no corpo (nervoso, sanguíneo, adiposo, muscular e ósseo). Em condições normais, apartir do momento em que ocorre tal diferenciação, não existirá possibilidade de reversão pois uma vez diferenciada ela passará somente a dar origem às células do grupo ao qual pertence (p. ex: células hepáticas só originaram células do fígado), exceto se forem modificadas em laboratório. Todo o processo, inicia-se nos animais na fase denominada blástula, em que o embrião é constituído por aproximadamente 100 células, acontecendo de forma contínua e progressiva e é proporcionado por diversas divisões celulares (mitoses) que iniciam a formação do arcabouço humano, o embrião. Nesta fase ocorrerá os primeiros estágios de especialização celular (clivagens) em que as células externas da blástula originarão os anexos embrionários enquanto as células internas originarão tecidos e órgãos do embrião que está em formação (as CTE). Posteriormente ocorrerá a formação dos primeiros grupos especializados de células (as CT multipotentes) que conduzirão a formatação dos diferentes grupos celulares existentes no organismo humano.", HtmlCompat.FROM_HTML_MODE_LEGACY)),
            new Section("REFERÊNCIAS",
                    HtmlCompat.fromHtml("BARROS; S.V.G.; DEL CARLO, RJ.; VILORIA, M.I.Y. et ai. Auto-enxerto percutâneo de medula óssea. I. coleta, preparo e aplicação. Ciência Rural, v.31,n.6, p.1013.,1018, 2001." +
                            "<br><br>BIANCO, P.; ROBEY, P.O. <b>Stem celI in tissue engineering</b>. Nature, v.414,n.ll, p.118-121,2001" +
                            "<br><br>JUNQUEIRA, L. C. & CARNEIRO, J. <b>Biologia Celular e Molecular</b>. 9ª Edição. Editora Guanabara Koogan. 338 páginas. 2012." +
                            "<br><br>BYDLOWSKI, S. P. et al. <b>Características biológicas das células tronco mesenquimais</b>. Ver. Brasil. Hematol. Hemot., mais 2009, vol 31, supp1, p 25 35" +
                            "<br><br>CARVALHO, A.C.S.R. <b>Estudo da proliferação e diferenciação de células-tronco hematopoéticas provenientes de sangue de cordão umbilical na presença e ausência de mitógenos</b> [tese]. São Paulo: Instituto de Ciências biomédicas da Universidade de São Paulo; 2008" +
                            "<br><br>DE LA MORENA MT, GATTI RA. <b>A history of bone marrow transplantation. Hematology/oncologyclinicsof North America</b>. 2011;25(1):1-15." +
                            "<br><br>DESSEN, E. B. M. & MINGRONI-NETTO R. C. <b>Desvendando as células-tronco: dos sonhos à realidade</b>. São Paulo: Centro de Estudos do Genoma Humano da Universidade de São Paulo; 2007." +
                            "<br><br>DOWNING GJ and BATTEY JR. JF. <b>Technical assessment of the first 20 years of research using mouse embryonic stem cell lines. StemCells</b>. 2004; 22:1168-1180." +
                            "<br><br>KARPOWICZ, P., COHEN, C.B., KOOY,D. <b>It is ethicalto transplanthuman stem celI sintonon human embryos</b>. NatureMedicine, v.417, n.l0, p.331-335, 2004." +
                            "<br><br>MACLAREN, A. <b>Ethical andsocial considerations of stem celI research</b>. Nature, v.414, n.U, p.129-131, 2-à o 1." +
                            "<br><br>MARCHETTO, M. C.N. et al. <b>A model for neural development and treatment of Rett Syndrome using human induced pluripotent stem cells</b>. Cell. v.143,n.4, p. 527–539, 2010." +
                            "<br><br>NAVES, M.M.V. <b>Beta-caroteno e vitamina A modulam a proliferação de células ovais e a expressão gênica para conexina 43 em modelo in vivo de diferenciação celular hepática</b>. 1999. Tese (Doutorado) - Faculdade de Ciências Farmacêuticas, Universidade de São Paulo, São Paulo." +
                            "<br><br>RIZZO, D., DEL CARLO, R.J., SILVA,AS.A., VILORlA, M.I.V. <b>Matriz óssea desmineralizada associada à medula óssea autógena fresca na artrodese vertebral dorsolateral lombar em coelhos</b>. Arquivo Brasileiro de Medicina Veterinária e Zootecnia, v.57, n.2, p.163-170, 2005." +
                            "<br><br>TAKAHASHI K, TANABE K, OHNUKI M, NARITA M, ICHISAKA T, TOMODA K, YAMANAKA S. <b>Induction of pluripotent stem cells from adult human fibroblasts by defined factors</b>. 2007" +
                            "<br><br>TAKAHASHI K, YAMANAKA S. <b>Induction of pluripotent stem cells from mouse embryonic and adult fibroblast cultures by defined factors</b>. 2006" +
                            "<br><br>THE NEWS AND EDITORIAL STAFFS. <b>Capturing the promise of youth</b>. Science 1999; 286:2238-2243." +
                            "<br><br>THOMSON JA, ITSKOVITZ-ELDOR J, SHAPIRO SS, WAKNITZ MA, SWIERGIEL JJ, MARSHALL VS, JONES JM. <b>Embryonic stem cells lines derived from human blastocysts</b>. 1998" +
                            "<br><br>ZHAO J, HAO HN, THOMAS RL, LYMAN WD. <b>An efficient method for the cryopreservation of fetal human liver hematopoeitic progenitor cells. Stemcells</b>. 2001;19(3):212-8." +
                            "<br><br>ZATZ, M. <b>“Células Tronco”</b>. Disponível em: http://www.ghente.org/temas/celulas-tronco/. Acesso em 22/09/2019." +
                            "<br><br>ZATZ, M. <b>“Células tronco, o que são?”</b>. Disponível em: http://www.lance-ufrj.org/ceacutelulas-tronco.html. Acesso em 30/09/2019." +
                            "<br><br>ZATZ, M. <b>Clonagem e células tronco</b>. Ciência e Cultura, v.56, n.3, julho/setembro2004." +
                            "<br><br>WAGERS AJ, and WEISSMAN IL. <b>Plasticity of Adult Stem Cells. Cell</b>. 2004; 116:639-684." +
                            "<br><br>YAMANAKA S. <b>A fresh look at iPS cells. Cell</b>. 2009; 137:13-17." +
                            "<br><br>YU, J; THOMSON, JA. <b>PluripotentStemCellLines</b> - 2008", HtmlCompat.FROM_HTML_MODE_LEGACY)),
    };

    public static Section[] getSections() {
        return sections;
    }
}
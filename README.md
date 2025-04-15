# Spring D&D 5e API

![GitHub Release](https://img.shields.io/github/v/release/davidAllenStephan/spring-dnd5eapi)
![GitHub License](https://img.shields.io/github/license/davidAllenStephan/spring-dnd5eapi)
![GitHub Issues or Pull Requests](https://img.shields.io/github/issues/davidAllenStephan/spring-dnd5eapi)
![GitHub last commit](https://img.shields.io/github/last-commit/davidAllenStephan/spring-dnd5eapi)

Spring Boot library wrapper for [D&D 5e API](https://www.dnd5eapi.co/).

## Features
* OpenFeign to interact with D&D 5e API REST API
* Resources cached locally with Hazelcast

## Install
Add dependency to Github Package registry

#### Github Package Registry
The library is available in Github Package Registry:

1. Add the repository to the pom.xml

        <repositories>
            <repository>
                <id>github</id>
                <name>GitHub davidAllenStephan spring-dnd5eapi</name>
                <url>https://maven.pkg.github.com/davidAllenStephan/spring-dnd5eapi</url>
                <releases>
                    <enabled>true</enabled>
                </releases>
                <snapshots>
                    <enabled>true</enabled>
                </snapshots>
            </repository>
        </repositories>

2. Add dependency

        <dependencies>
            <dependency>
                <groupId>com.davidmarino</groupId>
                <artifactId>spring-dnd5eapi</artifactId>
                <version>1.0.0</version>
            </dependency>
        </dependencies>

3. Add server in .m2/settings.xml. ACCESS_TOKEN must have at least read:packages

        <servers>
          <server>
              <id>github</id>
              <username>USER</username>
              <password>ACCESS_TOKEN</password>
          </server>
        </servers>

#### Maven
Alternatively, the source code can also be downloaded and installed in the local repository.

## Usage

#### Configuration
To use this library, add the following line to your Application class.

    @Import(SpringDnd5eApiConfig.class)

This will bootstrap both OpenFeign and Hazelcast configurations. Or you can ignore this step and roll your own configurations.
#### Example of Application class

    @SpringBootApplication
    @Import(SpringDnd5eApiConfig.class)
    public class DemoApplication {

        public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
            Main main = context.getBean(Main.class);
            main.printSpells();
        }

    }

#### Example of Component class
dnd5eApiSpells will have an error "Could not autowire. No beans of 'Dnd5eApiSpells' type found." That lingering error message is coming from your IDE (like IntelliJ or Eclipse) — not from Spring itself. It happens when the IDE doesn't understand how a bean is created (usually with Feign clients, dynamic proxies, or complex config).

    @Component
    public class Main {
    private final Dnd5eApiSpells dnd5eApiSpells;

        @Autowired
        public Main(Dnd5eApiSpells dnd5eApiSpells) {
            this.dnd5eApiSpells = dnd5eApiSpells;
        }

        public void printSpells() {
            System.out.println(dnd5eApiSpells.getSpells());
        }
    }

#### Resources
This library exposes all resources as Spring components, which can be autowired into your code.
Each component points to a separate resource in D&D 5e API.

* Dnd5eApiAbilityScores 
* Dnd5eApiAlignments 
* Dnd5eApiBackgrounds 
* Dnd5eApiClasses 
* Dnd5eApiConditions 
* Dnd5eApiDamageTypes 
* Dnd5eApiEquipmentCategories 
* Dnd5eApiEquipments 
* Dnd5eApiFeats 
* Dnd5eApiFeatures 
* Dnd5eApiImages 
* Dnd5eApiLanguages
* Dnd5eApiMagicItems
* Dnd5eApiMagicSchools
* Dnd5eApiMonsters
* Dnd5eApiProficiencies
* Dnd5eApiRaces
* Dnd5eApiRuleSections
* Dnd5eApiRules
* Dnd5eApiSkills
* Dnd5eApiSpells
* Dnd5eApiSubclasses
* Dnd5eApiSubraces
* Dnd5eApiTraits
* Dnd5eApiWeaponProperties

Each of these resources exposes a method to get all resources (paginated with a limit and offset) and methods to get resource by id or name, where available.


## License
This project is licensed under the [MIT license](http://opensource.org/licenses/mit-license.php)

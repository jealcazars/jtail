# jfxtail

Log viewer implemented with JavaFx

## Usage
- To create an executable jar , call `mvn clean install`. The jar-file will be placed at `target/jfxTail-jar-with-dependencies.jar`.
- To create an executable file with JavaFX and some installers, call `mvn jfx:native`. The native launchers or installers will be placed at `target/jfx/native`.

## Roadmap
_The following features will be included in later versions:_

- **File enconding** - User can set the encoding used to read the files
- **Search** - Search button is included but not implemented yet
- **Color picker** - Replace color combo for highlights with a proper color picker

## Known bugs

- When highlight filters are active, if one of the filters was disabled and is changed to enabled it will only show when the log file is modified (o clicking two times highlight filter button)
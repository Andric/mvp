public enum DataTypeEnum {
    CVV("Client"),
    EVV("Engagement"),
    FNA("FunctionalArea"),
    FNG("FunctionalGroup"),
    FNC("Function"),
    TKK("Task"),
    NTT("Note"),
    COM("Comment"),
    TGT("TagTool"),
    TGS("TagSystem"),
    TGM("TagMisc"),
    UNK("BaseNode"),
    Empty("Empty"),
    Error("Error"),
    Graph("Graph"),
    NodeList("NodeList");
  private String value;

  DataTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataTypeEnum fromValue(String text) {
    for (DataTypeEnum b : DataTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
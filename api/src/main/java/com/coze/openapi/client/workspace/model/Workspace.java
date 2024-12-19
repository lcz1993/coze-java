/* (C)2024 */
package com.coze.openapi.client.workspace.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Workspace {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("icon_url")
  private String iconUrl;

  @JsonProperty("role_type")
  private WorkspaceRoleType roleType;

  @JsonProperty("workspace_type")
  private WorkspaceType workspaceType;
}
